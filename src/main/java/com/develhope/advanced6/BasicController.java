package com.develhope.advanced6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@RestController
@RequestMapping("/sum")
public class BasicController {
        @GetMapping
        public int getSum() {
            Random random = new Random();
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            return number1 + number2;
        }

}
