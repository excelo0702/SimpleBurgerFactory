import Burger.*;

public class BurgerStore {
    public void orderBurger(String burgerType) {

        IBurger burger;
        if(burgerType.equals("Veg")) {
            burger = new VegBurger();
        }
        else if( burgerType.equals("cheese")) {
            burger = new CheeseBurger();
        }
        else if( burgerType.equals("chicken")) {
            burger = new ChickenBurger();
        }
//        else if(burgerType.equals("corn")) {
//            burger = new CornBurger();
//        }
        else if(burgerType.equals("coco")){
            burger = new CocoBurger();
        } else if(burgerType.equals("picky")){
            burger = new PickyBurger();
        } else if(burgerType.equals("spinach")){
            burger = new CocoBurger();
        }
        else {
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
