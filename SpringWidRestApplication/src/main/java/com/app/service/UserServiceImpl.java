package com.app.service;

import com.app.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static Map<Integer, User> userMap = new HashMap<Integer, User>();

    public boolean add(User user) {
        if (userMap.containsKey(user.getUserId()))
            return false;
        else
            userMap.put(user.getUserId(), user);
        return true;
    }

    public User get(String uid) {
        System.out.println("from getUser" + userMap);
        if (userMap.containsKey(Integer.parseInt(uid)))
            return userMap.get(uid);
        else
            return null;
    }

    public boolean update(String uid, User user) {
        if (userMap.containsKey(Integer.parseInt(uid))) {
            userMap.put(Integer.parseInt(uid), user);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String uid) {
        if(userMap.containsKey(Integer.parseInt(uid))){
            userMap.remove(userMap.get(uid));
            return true;
        }
        return false;
    }
}
