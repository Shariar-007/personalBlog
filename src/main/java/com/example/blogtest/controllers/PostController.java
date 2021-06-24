package com.example.blogtest.controllers;

import com.example.blogtest.models.Post;
import com.example.blogtest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(name = "/api/v1")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping(name = "/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @PostMapping(name = "/posts")
    public Post createPost(@RequestBody Post post){
        return postRepository.save(post);
    }

}
