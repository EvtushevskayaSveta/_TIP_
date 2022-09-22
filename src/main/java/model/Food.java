package model;

import java.util.Objects;

public class Food {
    protected String preparedness;

    public Food(String preparedness) {
        this.preparedness = preparedness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(preparedness, food.preparedness);
    }

    @Override
    public String toString() {
        return preparedness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(preparedness);
    }

    public String getPreparedness() {
        return preparedness;
    }

    public void setPreparedness(String preparedness) {
        this.preparedness = preparedness;
    }
}
