package org.tominos;

public class Crust {
    private String crustType;
    private int price;

    public Crust(String crustType, int price) {
        this.crustType = crustType;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
