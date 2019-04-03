package za.ac.cputweekDesignparttens;

public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers, burns, and french fries ");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");

    }

    @Override
    public void cleanUp() {

        System.out.println("Throwing away paper plates");

    }
}
