package com.spring.codeblogp.repository;

import com.spring.codeblogp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
