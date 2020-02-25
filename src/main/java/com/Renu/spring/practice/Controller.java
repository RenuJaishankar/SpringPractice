package com.Renu.spring.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//controller class with annotation, @RestController is a more fleshed out version of @controller.
@RestController
public class Controller {
@RequestMapping("/hello")
    public String hello(){
       return "Hello World! My app works";

}

}
