package com.spring.codeblogp.utils;

import com.spring.codeblogp.model.Post;
import com.spring.codeblogp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class DummyData {

    @Autowired
    private PostRepository postRepository;

    //@PostConstruct
    public void savePosts() {

        ArrayList<Post> postList = new ArrayList<Post>();
        Post post1 = new Post();
        post1.setAutorDoPost("FabMaia");
        post1.setDataDeCriacaoDoPost(LocalDate.now());
        post1.setTituloDoPost("JPA");
        post1.setTextoDoPost("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus in purus quis eros commodo maximus. Fusce at bibendum odio. Nulla tempus ante a elit viverra pellentesque. Mauris facilisis enim ut libero blandit consequat. Donec convallis, neque at commodo elementum, leo mi venenatis ex, sed sollicitudin sem nisi vel orci. Quisque vel magna tristique, ornare odio in, volutpat purus. Proin sed orci non odio posuere scelerisque eget sed eros. Phasellus vel pretium nulla. Pellentesque eget lacinia lectus. Mauris et nulla nunc.");

        Post post2 = new Post();
        post2.setAutorDoPost("MicBrito");
        post2.setDataDeCriacaoDoPost(LocalDate.now());
        post2.setTituloDoPost("Spring");
        post2.setTextoDoPost("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus in purus quis eros commodo maximus. Fusce at bibendum odio. Nulla tempus ante a elit viverra pellentesque. Mauris facilisis enim ut libero blandit consequat. Donec convallis, neque at commodo elementum, leo mi venenatis ex, sed sollicitudin sem nisi vel orci. Quisque vel magna tristique, ornare odio in, volutpat purus. Proin sed orci non odio posuere scelerisque eget sed eros. Phasellus vel pretium nulla. Pellentesque eget lacinia lectus. Mauris et nulla nunc.");


        Post post3 = new Post();
        post3.setAutorDoPost("GubMaia");
        post3.setDataDeCriacaoDoPost(LocalDate.now());
        post3.setTituloDoPost("Docker");
        post3.setTextoDoPost("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus in purus quis eros commodo maximus. Fusce at bibendum odio. Nulla tempus ante a elit viverra pellentesque. Mauris facilisis enim ut libero blandit consequat. Donec convallis, neque at commodo elementum, leo mi venenatis ex, sed sollicitudin sem nisi vel orci. Quisque vel magna tristique, ornare odio in, volutpat purus. Proin sed orci non odio posuere scelerisque eget sed eros. Phasellus vel pretium nulla. Pellentesque eget lacinia lectus. Mauris et nulla nunc.");

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        for(Post post : postList) {
            Post postsaved = postRepository.save(post);
            System.out.println(postsaved.getId());
        }
    }
}
