/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_cabasag;

/**
 *
 * @author L12X17W13
 */

import java.util.Scanner;
public class Activity2 {
    String name;
    int age;
    String motto;
    
    public Activity2(String name, int age, String motto){
        this.name = name;
        this.age = age;
        this.motto = motto;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter motto: ");
        String motto2 = sc.nextLine();
        
        Activity2 obj1 = new Activity2(name2, age2, motto2);
        
        System.out.println("The name is " + obj1.name);
        System.out.println("The age is " + obj1.age);
        System.out.println("The motto is " + obj1.motto);
    }
}
