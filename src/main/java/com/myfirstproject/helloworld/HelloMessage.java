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

    //UC_4_ShowHelloName by the use of post request method
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTOBean user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";

    }

    //UC_5_ShowHelloName by use of put request method
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}


