package model;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    public void calculate(List<Beef> beefs, String preparedness) {
        int counter = (int) beefs.stream().filter(beef -> beef.toString().equals(preparedness)).count();
        System.out.println(counter);
    }
}
