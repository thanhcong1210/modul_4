package com.example.blog_update.repository;

import com.example.blog_update.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    List<Blog> findByCategoryId(Long categoryId);
    Page<Blog> findByCategoryId(Long categoryId, Pageable pageable);
}
