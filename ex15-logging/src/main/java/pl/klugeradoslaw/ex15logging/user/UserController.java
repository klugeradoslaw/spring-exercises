package pl.klugeradoslaw.ex15logging.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }
}
