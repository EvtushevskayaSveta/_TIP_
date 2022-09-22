package model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DessertMain {
    public static void main(String[] args) {
        List<String> components = List.of(
                "шоколад",
                "мороженное",
                "печенье"
        );
        List<String> componentTwo = List.of(
                "шоколад",
                "печенье"
        );


        List<Dessert> deserts = List.of(
                new Dessert(components),
                new Dessert(componentTwo)
        );
        System.out.println(deserts.stream().sorted(Comparator.comparing(dessert -> dessert.getComponents().size())).collect(Collectors.toList()));
    }
}
