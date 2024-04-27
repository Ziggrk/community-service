package com.groweasy.communityservice.service.impl;

import com.groweasy.communityservice.model.Post;
import com.groweasy.communityservice.repository.PostRepository;
import com.groweasy.communityservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
