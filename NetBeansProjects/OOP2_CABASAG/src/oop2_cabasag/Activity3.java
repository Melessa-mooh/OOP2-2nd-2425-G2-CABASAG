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

public class Activity3 {
    private String name;
    private int age;
    private String motto;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setMotto(String motto){
        this.motto = motto;
    }
    
    public String getMotto(){
        return motto;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Activity3 obj = new Activity3();
        
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        obj.setName(name2);
        
        System.out.print("Enter age: ");
        int age2 = sc.nextInt();
        obj.setAge(age2);
        sc.nextLine();
        
        System.out.print("Enter motto: ");
        String motto2 = sc.nextLine();
        obj.setMotto(motto2);
        
        System.out.println("The name is " + obj.getName());
        System.out.println("The age is " + obj.getAge());
        System.out.println("The motto is " + obj.getMotto());
    }
}
