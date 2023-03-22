package pl.klugeradoslaw.ex07calcnettobruttodto;

import org.springframework.stereotype.Service;

@Service
public class VatCalcService {
    double calcVat(double nettoPrice, String category) {
        double vatRate = switch (category) {
            case "service" -> 0.23;
            case "food" -> 0.05;
            default -> 0.15;
        };
        double vat = nettoPrice * vatRate;
        return vat;
    }
    double calcBruttoPrice(double nettoPrice, String category) {
        return nettoPrice + calcVat(nettoPrice, category);
    }
}
