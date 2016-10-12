/*
 * Created by Ethan Watt
 * On October 12, 2016
 * Created to create a car class that generates cars
 */

package cartester;

/**
 *
 * @author etwat3497
 */
public class CarTester {

    /**
     * pre: String array
     * post: void
     * Main method to print car characteristics
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Call to car class
        Car car1 = new Car("Dodge","Challenger","Automatic",2014,20000,45000.00);
        Car car2 = new Car("Acura","Legend","Manual");
        Car car3 = new Car();
        
        //Output car information
        System.out.println(car1);
        System.out.println("------------------");
        System.out.println(car2);
        System.out.println("------------------");
        System.out.println(car3);
        
        //Call honk horn method in car class
        car1.honkHorn();
    }
    
}
