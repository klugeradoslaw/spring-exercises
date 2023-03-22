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
        double vat = calcService.calcVat(nettoPrice, category);
        double bruttoPrice = calcService.calcBruttoPrice(nettoPrice, category);
        model.addAttribute("nettoPrice", nettoPrice);
        model.addAttribute("bruttoPrice", bruttoPrice);
        model.addAttribute("vat", vat);

        return "result";
    }
}
