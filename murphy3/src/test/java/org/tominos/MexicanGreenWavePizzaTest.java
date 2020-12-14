package org.tominos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MexicanGreenWavePizzaTest {
private MexicanGreenWavePizza mexicanGreenWavePizza;

    @Before
    public void setUp(){
        mexicanGreenWavePizza = new MexicanGreenWavePizza();
    }

    @Test
    public void shouldReturnBasicMexicanGreenWavePizzaPrice() {

        Assert.assertEquals(300, mexicanGreenWavePizza.getPrice());
    }

    @Test
    public void shouldReturnPriceForMexicanPizzaWithCheeseBurstCrust(){
        //given //when
        mexicanGreenWavePizza.setCrust(new Crust("cheeseBurst",80));

        //then
        Assert.assertEquals(380, mexicanGreenWavePizza.getPrice());
    }

    @Test
    public void shouldReturnPriceForMexicanPizzaWithOlives(){
        //given //when
        mexicanGreenWavePizza.setToppings(new Toppings("Olives",20));

        //then
        Assert.assertEquals(320, mexicanGreenWavePizza.getPrice());
    }

    @Test
    public void shouldReturnPriceForMexicanPizzaWithOlivesAndCorn(){
        //given //when
        Toppings toppings = new Toppings("Olives", 20);
        toppings.addExtraTopping("Corn", 10);

        //when
        mexicanGreenWavePizza.setToppings(toppings);

        //then
        Assert.assertEquals(330, mexicanGreenWavePizza.getPrice());
    }

    @Test
    public void shouldReturnPriceForMexicanPizzaWithAllTheTrimmings(){
        //given //when
        Toppings toppings = new Toppings("Olives", 20);
        toppings.addExtraTopping("Corn", 10);

        //when
        mexicanGreenWavePizza.setToppings(toppings);
        mexicanGreenWavePizza.setCrust(new Crust("cheeseBurst",80));

        //then
        Assert.assertEquals(410, mexicanGreenWavePizza.getPrice());
    }

}
