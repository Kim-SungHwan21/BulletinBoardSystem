package com.nhnacademy.project.repository;

import java.util.List;

public interface UserRepository {
    void add(UserInfo user);
    void modify(UserInfo user);
    UserInfo remove(String id);

    UserInfo getUser(String id);
    List<User> getUsers();
}
