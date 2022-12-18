package com.spring.codeblogp.controller;

import com.spring.codeblogp.model.Post;
import com.spring.codeblogp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {

        ModelAndView modelAndViewPost = new ModelAndView("posts");
        List<Post> posts = postService.findAll();
        modelAndViewPost.addObject("posts", posts);

        return modelAndViewPost;
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPostDetail(@PathVariable("id") long id) {

        ModelAndView modelAndViewPost = new ModelAndView("postDetail");
        Post post = postService.findById(id);
        modelAndViewPost.addObject("post", post);

        return modelAndViewPost;
    }

    @RequestMapping(value = "/newpost", method = RequestMethod.GET)
    public String getPostForm() {

        return "postForm";
    }

    @RequestMapping(value = "/newpost", method = RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()){
            return "redirect:/newpost";
        }
        post.setDataDeCriacaoDoPost(LocalDate.now());
        postService.save(post);
        return "redirect:/posts";
    }
}
