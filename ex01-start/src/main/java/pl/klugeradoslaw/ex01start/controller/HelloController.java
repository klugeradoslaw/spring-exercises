package pl.klugeradoslaw.ex01start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klugeradoslaw.ex01start.service.HelloService;

@RestController
public class HomeController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }

}
