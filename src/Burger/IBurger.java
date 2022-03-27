package Burger;

public abstract class IBurger {

    public void bake(){
        System.out.println("This is your burger. Baking it");
    }

    public void pack() {
        System.out.println("This is your burger. Happy Packing!");
    }

    public void serve() {
        System.out.println("This is your burger. Happy Eating!");
    }

    public abstract void description();
}
