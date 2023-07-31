package com.annotations.springannotation.controller;

import com.annotations.springannotation.beans.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("/api/v1")  //all the urls will begin with /api/v1 when used at class level
public class ControllerDemo {
    private Book book;

    //Controller annotation will mark any class to behave as SpringMVC controller
    //It indicates class to handle http req and is a specialization of Component class

    //RequestMapping annotation is used in combination to map the incoming req res and
    //ResponseBody annotation converts the response to json using its internal
    //SpringMVC http converter class

    //From Spring 4.0 onwards RestController was introduced which is a combination
    //of Controller and ResponseBody annotation.

    @RequestMapping("/")
    //@ResponseBody
    public String home() {
        return "Welcome to our homepage!";
    }

//    @RequestMapping(value = {"/books", "spring-mvc-demo"}, method = RequestMethod.GET,
//            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
//            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE
//            })
    //to use multiple url use value property
    //by default GET method is used.

    //produces method will generate the specified type of media type e.g. here it will generate json/xml type
    //consumes method will receive the specified type of media type e.g. here it will generate json/xml type

    //we can use GetMapping instead of RequestMapping, it's same as RequestMapping.

    @GetMapping(value = {"/books", "/spring-mvc-demo"})
    public Book getBooks() {
        return new Book(1, "Learn Spring", "Spring Core and Spring MVC");
    }

    //PostMapping is shortcut for post request and is specialization of RequestMapping.
    //by, default it uses POST method.
    //RequestBody is used to send data inside forms in-case for POST method

    @PostMapping(value = "/create-book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book createBook(@NotNull @RequestBody Book book) {
        this.book = book;
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDesc());
        return book;
    }

}
