import Burger.*;

public class BurgerStore {
    public void orderBurger(String burgerType) {

        // We have some different types of burger, so we are using decision
        // making statement on burgerType and then will create burger

        IBurger burger;
        if(burgerType.equals("Veg")) {
            burger = new VegBurger();
        } else if( burgerType.equals("cheese")) {
            burger = new CheeseBurger();
        } else if( burgerType.equals("chicken")) {
            burger = new ChickenBurger();
        } else if(burgerType.equals("corn")) {
            burger = new CornBurger();
        } else {
            burger = new PlainBurger();
        }
        burger.description();
        // bake burger
        burger.bake();
        // pack burger
        burger.pack();
        //serve burger
        burger.serve();
    }
}
