package pl.klugeradoslaw.ex07calcnettobruttodto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class vatController {

    private final VatCalcService calcService;


    public vatController(VatCalcService calcService) {
        this.calcService = calcService;
    }

    @PostMapping("/calc")
    String calculate(@RequestParam double nettoPrice, @RequestParam String category, Model model) {
        VatDto vatObj = calcService.calcVat(nettoPrice, category);
        model.addAttribute("vat", vatObj);
        return "result";
    }
}
