/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4;

/**
 *
 * @author L12X17W13
 */

import java.util.*;
public class Activity4 { //Controller file
    public static void main(String[] args) {
        Parent objParent = new Parent();
        Child1 objChild1 = new Child1();
        Child2 objChild2 = new Child2();

        objParent.display();
        objChild1.display();
        objChild2.display();
        
        show(2);
        show(2,25);
        show("Melody Ann", 19);
    }
   //Overloading
    public static void show(int num1){
        System.out.println("The number is " + num1);
    }
    
    public static void show(int num1, int num2){
        System.out.println("The numbers are " + num1 + " and " + num2);
    }
    
    public static void show(String name, int age){
        System.out.println("The name is " + name + " and the age is " + age);
    }
}
