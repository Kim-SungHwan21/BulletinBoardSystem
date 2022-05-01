package com.nhnacademy.project.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDataLoad implements UserRepository{
    Map<String, UserInfo> list = new HashMap<>();

    @Override
    public void add(UserInfo user) {
        list.put(user.getId(), user);
    }

    @Override
    public void modify(UserInfo user) {
        list.put(user.getId(), user);
    }

    @Override
    public UserInfo remove(String id) {
        return list.remove(id);
    }

    @Override
    public UserInfo getUser(String id) {
        return list.get(id);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(list.values());
    }
}
