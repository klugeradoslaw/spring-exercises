package pl.klugeradoslaw.ex12simplecalculator;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {


    @PostMapping
    String calc(@RequestParam double a, @RequestParam  double b) {

    }
}
