package com.app.controller;

import com.app.domain.User;
import com.app.service.UserService;
import com.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    @Autowired
    private UserService service ;
    //= new UserServiceImpl();

    /*public void setService(UserService service) {
        System.out.println("service is injected");
        this.service = service;
    }*/

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody
    String addUser(@RequestBody User use) {
        boolean isAdded = false;
        isAdded = service.add(use);
        if (isAdded) {
            return "User Added Successfully";
        } else {
            return "Failed to add user";
        }
    }

    @RequestMapping(value = "/get", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@RequestParam(name = "uid") String uid) {
        System.out.println("User Id :: " + uid);
        User user = service.get(uid);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    String updateUserById(@RequestParam String uid, @RequestBody User user) {
        boolean isUpdate = service.update(uid, user);
        if (isUpdate) {
            return "User Updated Successfully";
        } else {
            return "Faied to Update User || User User does not exist";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public @ResponseBody
    String delete(@RequestParam(name = "uid") String uid) {
        boolean isDelete = false;
        isDelete = service.delete(uid);
        if (isDelete) {
            return "User Deleted Succeessfully";
        } else {
            return "Failed to delete User";
        }
    }

    @RequestMapping(value = "/show", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET
    )
    public @ResponseBody
    List showMap() {
        List list = new ArrayList();
        Map map = service.getUserMap();
        for (Object u : map.values()) {
            User user = (User) u;
            list.add(user);
        }
        System.out.println("List :: " + list);
        return list;
    }
}
