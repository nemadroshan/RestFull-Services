package com.nt.config;

import com.nt.resource.GreetResorce;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class AppConfig extends Application {
    @Override
    public Set<Object> getSingletons() {
        Set<Object> set =new HashSet<Object>();
        set.add(new GreetResorce());
        return set;
    }

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}
