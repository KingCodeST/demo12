import za.ac.cputweekDesignparttens.CheeseBurgerMeal;
import za.ac.cputweekDesignparttens.HamburgerMeal;
import za.ac.cputweekDesignparttens.Meal;

public class MainDriver {

    public  static void main(String[] args)
    {
        Meal meal1 =new HamburgerMeal();
        meal1.doMeal();

        System.out.println();


        Meal meal2=new CheeseBurgerMeal();
        meal2.doMeal();


    }

}
