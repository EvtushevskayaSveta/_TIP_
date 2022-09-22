import calculator.Calculator;
import exception.InvalidArgumentException;
import model.Beef;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static List<Beef> beefs = List.of(
            new Beef("с кровью"),
            new Beef("прожаренное"),
            new Beef("норма"),
            new Beef("прожаренное"),
            new Beef("норма")
    );;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculate(beefs, "норма");

        while (true) {
            System.out.println("Введите параметр (calories, sort)");
            String request = new Scanner(System.in).nextLine();
            if (request.equals("calories")) {
                calculateCalories(beefs);
            } else if (request.equals("sort")) {
                beefs = sortBeefs(beefs);
            } else {
                throw new InvalidArgumentException("не валидный параметр");
            }
        }
    }

    private static List<Beef> sortBeefs(List<Beef> beefs) {
        beefs = beefs.stream().sorted(Comparator.comparing(Beef::getCalories)).collect(Collectors.toList());
        beefs.forEach(beef -> System.out.println(beef.getCalories()));
        return beefs;
    }

    private static void calculateCalories(List<Beef> beefs) {
        beefs.forEach(Beef::calculateCalories);
        beefs.forEach(beef -> System.out.println(beef.getCalories()));
    }
}
