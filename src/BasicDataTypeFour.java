
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BasicDataTypeFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input weight in pounds: ");
        double pounds = input.nextDouble();
        
        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        double weightInKg = pounds * KILOGRAMS_PER_POUND;
        double heightInMeters = inches * METERS_PER_INCH;
        
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        
        System.out.printf("Body mass Index is %.14f%n", bmi);
        
        input.close();
        
    }
    
}
