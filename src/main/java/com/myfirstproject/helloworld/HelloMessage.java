package com.myfirstproject.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//UC_1_ShowHelloMessage
@RestController
public class HelloMessage {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}