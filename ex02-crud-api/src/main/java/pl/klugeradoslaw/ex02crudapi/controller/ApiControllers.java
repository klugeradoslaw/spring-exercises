package pl.klugeradoslaw.ex02crudapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @GetMapping("/")
    public String getPage() {
        return "Welcome!";
    }

}
