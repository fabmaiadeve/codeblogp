package com.spring.codeblogp.service;

import com.spring.codeblogp.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();

    Post findById(long id);

    Post save(Post post);
}
