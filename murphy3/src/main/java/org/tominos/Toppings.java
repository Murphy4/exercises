package org.tominos;

import java.util.HashMap;

public class Toppings {

    private HashMap<String, Integer> toppings = new HashMap<>();

    public Toppings(String topping, int price) {
        this.toppings.put(topping, price);
    }

    public int getPrice() {
        return toppings.values().stream().reduce(0, (sum, price) -> sum += price);
    }

    public void addExtraTopping(String topping, int price) {
        this.toppings.put(topping, price);
    }
}
