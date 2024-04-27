package com.groweasy.communityservice.repository;

import com.groweasy.communityservice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Boolean existsByTitle(String title);
}
