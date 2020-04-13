package com.rn.application;

import com.rn.resource.WelcomeResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MyApplication extends Application {
    public static Set<Object> set = new HashSet<>();

    public MyApplication() {
        WelcomeResource welcomeResource = new WelcomeResource();
        set.add(welcomeResource);
    }
    public Set<Object> getSingleton(){
        return set;
    }
}
