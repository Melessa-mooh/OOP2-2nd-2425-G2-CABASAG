/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;

/**
 *
 * @author L12X17W13
 */

import java.util.*;
import java.text.DecimalFormat;

public class Activity10 {
    public static void main(String[] args) {
        GenericClass<Double, Double> objOne = new GenericClass<>();
        Scanner scan = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#,###.00");
        
        while(true){
            try{
                System.out.print("Enter first number: ");
                double num1 = scan.nextDouble();
                if(num1 > 0){
                    objOne.setData1(num1);
                    break;
                }
            } catch (Exception e){
                System.out.println("Invalid input! Please try again.");
                scan.nextLine();
            }
        }
        
         while(true){
            try{
                System.out.print("Enter second number: ");
                double num2 = scan.nextDouble();
                if(num2 > 0){
                    objOne.setData2(num2);
                    break;
                }
            } catch (Exception e){
                System.out.println("Invalid input! Please try again.");
                scan.nextLine();
            }
        }
         
        System.out.println("The sum of the " + dc.format(objOne.getData1()) + " and " + dc.format(objOne.getData2()) + " is " + dc.format(objOne.computeSum()));
        System.out.println("The difference of the " + dc.format(objOne.getData1()) + " and " + dc.format(objOne.getData2()) + " is " + dc.format(objOne.computeDifference()));
        System.out.println("The product of the " + dc.format(objOne.getData1()) + " and " + dc.format(objOne.getData2()) + " is " + dc.format(objOne.computeProduct()));
        System.out.println("The quotient of the " + dc.format(objOne.getData1()) + " and " + dc.format(objOne.getData2()) + " is " + dc.format(objOne.computeQuotient()));
        System.out.println("The remainder of the " + dc.format(objOne.getData1()) + " and " + dc.format(objOne.getData2()) + " is " + dc.format(objOne.computeRemainder()));
    }
}
