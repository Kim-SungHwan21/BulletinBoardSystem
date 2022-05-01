package com.nhnacademy.project.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostDataLoad implements PostRepository {
    Map<Long, Post> posts = new HashMap<>();

    @Override
    public long register(Post post) {
        posts.put(post.getId(), post);
        return post.getId();
    }

    @Override
    public void modify(Post post) {
        posts.put(post.getId(), post);
    }

    @Override
    public Post remove(long id) {
        return posts.remove(id);
    }

    @Override
    public Post getPost(long id) {
        return posts.get(id);
    }

    @Override
    public List<Post> getPosts() {
        return new ArrayList<>(posts.values());
    }
}
