package pl.klugeradoslaw.ex03bmibmr;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class BodyWeightController {

    public final BodyWeightCalculator bodyWeightcalculator;

    public BodyWeightController(BodyWeightCalculator bodyWeightcalculator) {
        this.bodyWeightcalculator = bodyWeightcalculator;
    }


    ResponseEntity<BMIDto> calculateBMI(@RequestParam double weight, @RequestParam double height) {

    }
}
