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
public class problem7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("8; ");
        int number = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
        
    }
    
}
