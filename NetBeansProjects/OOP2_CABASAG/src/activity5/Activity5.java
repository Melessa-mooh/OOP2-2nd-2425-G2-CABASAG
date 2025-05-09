/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;

/**
 *
 * @author L12X17W13
 */

import java.util.*;

public class Activity5 { //Concrete class
    //Abstract class cannot be instantiated. It provides security as it runs in the background.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dog objDog = new Dog();
        objDog.makeSound();

        Cat objCat = new Cat();
        objCat.makeSound();
        
        boolean isEnabled = true; //flag variable
        int age = 0;
        
        while(isEnabled){
            try{
                System.out.print("Enter age: ");
                age = sc.nextInt();
                objCat.setAge(age);
                isEnabled = false;
            }catch(Exception e){
                System.out.println("Imvalid age input! Error: " + e); //display error
                sc.next(); //refresh scanner
            }
        }
        
        System.out.println("The cat age is " + objCat.getAge());
    }
     
}
