package gabasiccontrolstructure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class BasicControlStructuresOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input numbers: ");
        int number = scanner.nextInt();
        
        
        if (number > 0){
            System.out.println(number + " is positive");
        }else if (number < 0){
            System.out.println(number + " is negative");
        }else {
            System.out.println("The number is zero");
        }
        
        scanner.close();
    }
    
}
