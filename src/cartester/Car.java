/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

//Add imports
import java.text.DecimalFormat;

/**
 *
 * @author etwat3497
 */
public class Car {
    //Declare global variables
    private String make, model, transmission;
    private int year, mileage;
    private double price;
    
    DecimalFormat x = new DecimalFormat("##.##"); //Set up for decimal format
    
  /**
   * pre: none
   * post: none
   * Default constructor to assign base values to variables
   */
    public Car(){
        make = "Unknown make";
        model = "Unknown model";
        transmission = "Unknown transmission type";
        year = (int)(Math.random()*20)+1;
        mileage = (int)(Math.random()*1000000)+1;
        price =(double)(Math.random()*100000)+1;
        
    }
    
  /**
   * pre: make, model, transmission, year, mileage, price
   * post: none
   * Method of constructor to look for 6 variable values in carTester
   */
    public Car(String makeType, String modelType, String transmissionType, int yearAmount, int mileageAmount, double priceAmount){
        make = makeType;
        model = modelType;
        transmission = transmissionType;
        year = yearAmount;
        mileage = mileageAmount;
        price = priceAmount;
    }
    
  /**
   * pre: make, model, transmission
   * post: none
   * Method of alternate constructor to look for 3 variable values in carTester
   */
    public Car(String makeType, String modelType, String transmissionType){
        make = makeType;
        model = modelType;
        transmission = transmissionType;
        year = (int)(Math.random()*20)+1;
        mileage = (int)(Math.random()*1000000)+1;
        price = (double)(Math.random()*100000)+1;
    }
    
  /**
   * pre: none
   * post: none
   * Method to set string for a car honking its horn
   */
    public void honkHorn(){
        System.out.println("Honk Honk");
    }
    
  /**
   * pre: none
   * post: output to carTester
   * Method to display all characteristics of the car
   */
    public String toString(){
        String output = "Make: "+make+"\n";
        output += "Model: "+model+"\n";
        output += "Transmission Type: "+transmission+"\n";
        output += "Year: "+year+"\n";
        output += "Mileage: "+mileage+"\n";
        output += "Price: "+x.format(price)+"\n";
        return output;
    }
    
}
