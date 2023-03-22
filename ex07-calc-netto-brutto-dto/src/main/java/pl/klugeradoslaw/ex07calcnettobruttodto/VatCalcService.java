package pl.klugeradoslaw.ex07calcnettobruttodto;

import org.springframework.stereotype.Service;

@Service
public class VatCalcService {


    private double calcVatAmount(double nettoPrice, String category) {
        double vatRate = switch (category) {
            case "service" -> 0.23;
            case "food" -> 0.05;
            default -> 0.15;
        };
        double vat = nettoPrice * vatRate;
        return vat;
    }
    VatDto calcVat(double nettoPrice, String category) {
       double vat = calcVatAmount(nettoPrice, category);
       double bruttoPrice = nettoPrice + vat;
       return new VatDto(nettoPrice, vat, bruttoPrice);
    }

}
