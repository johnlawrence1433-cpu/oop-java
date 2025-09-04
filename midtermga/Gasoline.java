
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Gasoline {
         public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        final double LITERS_PER_GALLON= 3.785412;
        
      
        System.out.println("Enter number of liters of gasoline: ");
        double liters = input. nextDouble();
        
        
       
        System.out.println("Enter distance traveled in miles: ");
        double miles = input.nextDouble();
        
        
        double gallons = liters / LITERS_PER_GALLON;
        
        
        double mpg = miles / gallons;
        
        
        System.out.printf("The car delivered %.6f miles per gallons",mpg);
        
        input.close();
         }
}
    
    
            
            
       
    