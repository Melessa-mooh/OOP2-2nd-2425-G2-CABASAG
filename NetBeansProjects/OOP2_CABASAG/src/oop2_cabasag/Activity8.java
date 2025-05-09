/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_cabasag;

/**
 *
 * @author L12X17W13
 */
public class Activity8 {
    public static void main(String[] args) {
        Activity8 objOne = new Activity8();
        objOne.display("Melody Ann");
        objOne.display(20);
        objOne.display(500);
        objOne.display('F');
    }
    
    public<T> void display(T value){
        System.out.println("The value is " + value);
    }
}
