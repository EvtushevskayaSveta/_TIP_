package model;

public class Beef extends Food implements Nutritious {

    private int calories;

    public Beef(String preparedness) {
        super(preparedness);
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void calculateCalories() {
        if (preparedness.equals("с кровью")) {
            calories = 210;
        } else if (preparedness.equals("норма")) {
            calories = 230;
        } else if (preparedness.equals("прожаренное")) {
            calories = 300;
        }
    }
}
