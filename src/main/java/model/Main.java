package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Beef> beefs = List.of(
                new Beef("с кровью"),
                new Beef("прожаренное"),
                new Beef("норма"),
                new Beef("прожаренное"),
                new Beef("норма")
        );

        Calculator calculator = new Calculator();
        calculator.calculate(beefs, "норма");


        while (true) {
            System.out.println("Введите параметр (calories, sort)");
            String request = new Scanner(System.in).nextLine();
            if (request.equals("calories")) {
                beefs.forEach(Beef::calculateCalories);
                beefs.forEach(beef -> System.out.println(beef.getCalories()));
            } else if (request.equals("sort")) {
                beefs = beefs.stream().sorted(Comparator.comparing(Beef::getCalories)).collect(Collectors.toList());
                beefs.forEach(beef -> System.out.println(beef.getCalories()));
            } else {
                throw new InvalidArgumentException("не валидный параметр");
            }

        }
    }
}
