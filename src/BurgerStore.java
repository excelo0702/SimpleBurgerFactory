import Burger.*;

public class BurgerStore {
    public void orderBurger() {

        IBurger burger = new PlainBurger();
        // bake burger
        burger.bake();
        // pack burger
        burger.pack();
        //serve burger
        burger.serve();
    }
}
