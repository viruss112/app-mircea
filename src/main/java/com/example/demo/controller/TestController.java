package com.example.demo.controller;

import com.example.demo.Entities.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @Autowired
    public  PostService postService;


    @GetMapping(value="/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

}
