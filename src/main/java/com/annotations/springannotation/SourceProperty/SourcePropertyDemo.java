package com.annotations.springannotation.SourceProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SourcePropertyDemo {

    //using Environment class to fetch data using field based injection and passing key name to getProperty() method.
    @Autowired
    private Environment environment;
    //@Value("${user.name}")
    private String userName;

    //@Value("${user.email}")
    private String emailId;

    //@Value("${user.password}")
    private String password;

    public String getUserName() {
        return environment.getProperty("user.name");
    }

    public String getEmailId() {
        return environment.getProperty("user.emailId");
    }

    public String getPassword() {
        return environment.getProperty("user.password");
    }
}
