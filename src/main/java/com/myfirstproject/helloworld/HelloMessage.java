package com.myfirstproject.helloworld;
import org.springframework.web.bind.annotation.*;

//UC_1_ShowHelloMessage
@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

//UC_2_ShowHelloName as query parameter
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

//UC_3_ShowHelloName as path variable
@GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
    return "Hello " + name + " from BridgeLabz";

   }

}