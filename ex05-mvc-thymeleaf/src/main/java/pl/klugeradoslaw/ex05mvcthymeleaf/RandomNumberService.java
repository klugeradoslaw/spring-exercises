package pl.klugeradoslaw.ex05mvcthymeleaf;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service

public class RandomNumberService {
    private final Random random = new Random();
    int generateRandomNumber(int start, int end) {
        int range = end - start + 1;
        int randomNumber = random.nextInt(range);
        return start + randomNumber;
    }
}
