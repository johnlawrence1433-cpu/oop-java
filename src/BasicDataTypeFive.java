
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BasicDataTypeFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input distance in metes: ");
        double distanceMeters = input.nextDouble();
        
        System.out.print("Input hours: ");
        int hours = input.nextInt();
        
        System.out.print("input minutes: ");
        int minutes = input.nextInt();
        
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        
        double timeInHours = totalSeconds / 3600.0;
        
        double speedMetersPerSecond = distanceMeters / totalSeconds;
        double speedKmPerHour = (distanceMeters / 1000.0) / timeInHours;
        double speedMilesPerHour = (distanceMeters / 1609.0) / timeInHours;
        
        System.out.printf("Your speed in meters/second is %.8f%n", speedMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", speedKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", speedMilesPerHour);
        
        
    }
    
}
