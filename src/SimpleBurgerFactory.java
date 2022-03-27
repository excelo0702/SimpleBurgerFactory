import Burger.*;

public class SimpleBurgerFactory {
    public IBurger createBurger(String burgerType) {
        // As customers are not liking CornBurger, so we are deleting it
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
        return burger;
    }
}
