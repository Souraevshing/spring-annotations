package com.annotations.springannotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    public String getDefaultName() {
        return defaultName;
    }

    @Value("default name")
    private String defaultName;

    @Value("${java.home}")
    private String javaHomeDir;

    @Value("${HOME}")
    private String currentDir;

    public String getJavaHomeDir() {
        return javaHomeDir;
    }

    public String getCurrentDir() {
        return currentDir;
    }
}
