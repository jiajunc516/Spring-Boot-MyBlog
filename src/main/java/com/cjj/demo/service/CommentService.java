package com.cjj.demo.service;

import com.cjj.demo.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);
    Comment saveComment(Comment comment);
}
