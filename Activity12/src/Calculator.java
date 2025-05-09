/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melch
 */
import java.text.DecimalFormat;
public class Calculator implements CalculatorOperation{
    private double num1;
    private double num2;
    DecimalFormat df = new DecimalFormat("#.##");
    
   public void setNum1(Double num1){
       this.num1 = num1;
   }
   
   public void setNum2(Double num2){
       this.num2 = num2;
   }
    @Override
    public double add() {
        return (num1 + num2);
    }

    @Override
    public double subtract() {
        return (num1 - num2);
    }

    @Override
    public double multiply() {
        return (num1 * num2);
    }

    @Override
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return Double.parseDouble(df.format(num1 / num2));  
    }
}