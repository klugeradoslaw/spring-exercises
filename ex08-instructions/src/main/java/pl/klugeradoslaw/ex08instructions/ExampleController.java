package pl.klugeradoslaw.ex08instructions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("/")
    String example(Model model) {
        model.addAttribute("person", new Person("Radoslaw", "Kluge", 26));
        model.addAttribute("lang", "es");
        return "example";
    }
}
