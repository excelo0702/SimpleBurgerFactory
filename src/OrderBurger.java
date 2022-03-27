import Burger.*;

public class OrderBurger {
    public void orderBurger(String burgerType) {

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
        // bake burger
        burger.bake();
        // pack burger
        burger.pack();
        //serve burger
        burger.serve();
    }
}
