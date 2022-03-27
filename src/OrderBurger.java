import Burger.*;

public class OrderBurger {
    public void orderBurger(String burgerType) {

        IBurger burger = new PlainBurger();
        // bake burger
        burger.bake();
        // pack burger
        burger.pack();
        //serve burger
        burger.serve();
    }
}
