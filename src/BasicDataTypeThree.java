
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BasicDataTypeThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of minutes: ");
        long totalMinutes = input.nextLong();
        
        int minutesPerDay = 60 * 24;
        int daysPerYear = 365;
        
        long totalDays = totalMinutes / minutesPerDay;
        
        long years = totalDays / daysPerYear;
        long days = totalDays % daysPerYear;
        
        System.out.println(totalMinutes + " minutes is approxinately " + years + " years and " + days + " days");
        
        input.close();
        
        
    }
    
}
