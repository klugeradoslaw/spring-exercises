package pl.klugeradoslaw.ex12simplecalculator;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    static double calculate(double a, double b) {
        return a + b;
    }
}
