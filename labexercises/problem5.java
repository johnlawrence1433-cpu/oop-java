package labexercises;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("25: ");
        int firstsum = sc.nextInt();
        
        System.out.println("5: ");
        int secondsum =  sc.nextInt();
        
        int product = firstsum * secondsum;
        
        System.out.println(firstsum + " x " + secondsum + " = " + product);
        }
    
}
