package com.spring.codeblogp.controller;

import com.spring.codeblogp.model.Post;
import com.spring.codeblogp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        modelAndViewPost.addObject("posts", post);

        return modelAndViewPost;
    }

}
