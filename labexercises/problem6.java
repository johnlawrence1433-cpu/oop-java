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
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("25: ");
        int firstnum = sc.nextInt();
        
        System.out.print("24: ");
        int secondnum = sc.nextInt();
        
        int sum = firstnum + secondnum;
        int difference = firstnum - secondnum;
        int product = firstnum * secondnum;
        int qoutient = firstnum / secondnum;
        int remainder = firstnum % secondnum;
        
        System.out.println(firstnum + " + " + secondnum + " = " + sum);
        System.out.println(firstnum + " - " + secondnum + " = " + difference);
        System.out.println(firstnum + " x " + secondnum + " = " + product);
        System.out.println(firstnum + " / " + secondnum + " = " + qoutient);
        System.out.println(firstnum + " mod " + secondnum + " = " + remainder);
   }
    
}
