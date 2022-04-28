package com.nhnacademy.project.repository;

import java.util.List;

public interface PostRepository {
    long register(Post post);
    void modify(Post post);
    Post remove(long id);

    Post getPost(long id);
    List<Post> getPosts();
}
