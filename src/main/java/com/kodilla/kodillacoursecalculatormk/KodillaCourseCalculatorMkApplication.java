package com.kodilla.kodillacoursecalculatormk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorMkApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseCalculatorMkApplication.class, args);

        Calculator calc = new Calculator();
        System.out.println(calc.calculate("12 2 3 4 * 10 5 / + * +"));

    }

}
