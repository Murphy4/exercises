package org.tominos;

public class MexicanGreenWavePizza {

    private Crust crust;
    private int basePriceInPence;
    private Toppings toppings;

    public MexicanGreenWavePizza() {
        crust = new Crust("Pan", 0);
        toppings = new Toppings("jalapeno", 0);
        basePriceInPence = 300;
    }

    public int getPrice() {
        return basePriceInPence + crust.getPrice() + toppings.getPrice();
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }
}
