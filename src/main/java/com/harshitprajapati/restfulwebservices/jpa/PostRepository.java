package com.harshitprajapati.restfulwebservices.jpa;

import com.harshitprajapati.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
