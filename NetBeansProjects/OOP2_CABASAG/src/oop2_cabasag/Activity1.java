/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_cabasag;

/**
 *
 * @author L12X17W13
 */
import java.text.DecimalFormat;

public class Activity1 {
    
    double cash = 2175500.143; //instance variable
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        System.out.println("IT ROCKS!"); 
        
        Activity1 obj = new Activity1();
        obj.display();
        
        System.out.println("The cash is " + df.format(obj.cash));
    }
    
    public void display(){
        int ctr = 0;
        
        do{
            System.out.println("Hello World");
            ctr++;
        }while(ctr<10);
    }
}
