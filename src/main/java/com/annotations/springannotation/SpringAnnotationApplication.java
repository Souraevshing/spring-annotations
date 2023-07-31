package com.annotations.springannotation;

import com.annotations.springannotation.SourceProperty.SourcePropertyDemo;
import com.annotations.springannotation.value.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringAnnotationApplication.class, args);
        var homeDir = context.getBean(ValueAnnotation.class);
        SourcePropertyDemo sourceProperty = context.getBean(SourcePropertyDemo.class);

        System.out.println("Home Directory :" + homeDir.getJavaHomeDir());
        System.out.println("Current Directory: " + homeDir.getCurrentDir());
        System.out.println(sourceProperty.getEmailId());
        System.out.println(sourceProperty.getUserName());
        System.out.println(sourceProperty.getPassword());
    }

}