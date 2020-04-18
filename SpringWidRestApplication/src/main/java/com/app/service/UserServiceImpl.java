package com.app.service;

import com.app.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service(value = "service")
public class UserServiceImpl implements UserService {
    private static Map<Integer, User> userMap = new HashMap<Integer, User>();
    static {
        User user = new User();
        user.setEmail("some email");user.setGender("m");user.setUserName("user");user.setUserId(1);
        userMap.put(user.getUserId(),user);
    }

    public boolean add(User user) {
        if (userMap.containsKey(user.getUserId())) {
            System.out.println("map :: " + userMap);
            return false;
        }else {
            userMap.put(user.getUserId(), user);
            System.out.println("map :: " + userMap);
            return true;
        }
    }

    public  Map<Integer, User> getUserMap() {
        return userMap;
    }

    public User get(String uid) {
        System.out.println("from getUser" + userMap.toString());
        if (userMap.containsKey(Integer.parseInt(uid))) {
            System.out.println("Inside if");
            User user = userMap.get(Integer.parseInt(uid));
            System.out.println("form user:;"+user);
            return user;
        } else
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
