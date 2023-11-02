package com.butenov.socialmedia.core.dataaccess.repository;

import com.butenov.socialmedia.core.domain.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
