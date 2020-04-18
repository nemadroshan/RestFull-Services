package com.app.service;

import com.app.domain.User;

import java.util.Map;

public interface UserService {

    public boolean add(User user);
    public User get(String uid);
    public boolean update(String uid,User user);
    public boolean delete(String uid);
    public Map<Integer, User> getUserMap();
}
