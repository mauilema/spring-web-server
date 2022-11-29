package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

//Controller
//Tell Spring this is going to handle rest requests
@RestController
public class HelloWorldController {
//    GET need to map the get request to the URI
//    URI - /hello-world
//    method- "Hello World"
//    @RequestMapping(method= RequestMethod.GET, path = "/hello-world")

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World :)";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World :)");
    }

    //hello-world/path-variable/userInput
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
