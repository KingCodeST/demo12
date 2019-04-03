package za.ac.cputweekDesignparttens;

public class CheeseBurgerMeal extends Meal {


    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and chese");
    }

    @Override
    public void cook() {

        System.out.println("Cooking ground beef in pan");

    }

    public void eat(){
        System.out.println("The Cheese Burgers are tasty");
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
