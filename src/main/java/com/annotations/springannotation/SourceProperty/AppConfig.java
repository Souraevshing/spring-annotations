package com.annotations.springannotation.SourceProperty;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:env.properties") annotation is used to fetch data from custom properties file.

@Configuration
@PropertySource("classpath:env.properties")
public class AppConfig {
}
