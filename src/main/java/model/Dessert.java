package model;

import java.util.List;

public class Dessert {
    private List<String> components;

    public Dessert(List<String> components) {
        this.components = components;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "components=" + components +
                '}';
    }
}
