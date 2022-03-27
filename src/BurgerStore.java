import Burger.*;

public class BurgerStore {
    public void orderBurger(String burgerType) {

        SimpleBurgerFactory factory = new SimpleBurgerFactory();

        IBurger burger = factory.createBurger(burgerType);
        //This area is varying, so we are taking it out and putting it into SimpleBurgerFactory

//        if(burgerType.equals("Veg")) {
//            burger = new VegBurger();
//        } else if( burgerType.equals("cheese")) {
//            burger = new CheeseBurger();
//        } else if( burgerType.equals("chicken")) {
//            burger = new ChickenBurger();
//        } else if(burgerType.equals("corn")) {
//            burger = new CornBurger();
//        } else {
//            burger = new PlainBurger();
//        }
        burger.description();
        // bake burger
        burger.bake();
        // pack burger
        burger.pack();
        //serve burger
        burger.serve();
    }
}
