package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDTO;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDTO);





}
