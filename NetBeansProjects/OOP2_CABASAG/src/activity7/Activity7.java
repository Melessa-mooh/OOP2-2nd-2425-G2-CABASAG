/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity7;

/**
 *
 * @author L12X13W13
 */
import java.util.*;
import java.io.*;

public class Activity7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MakeFile fileMaker = new MakeFile();
        fileMaker.setFileName("file.txt");
        
        int choice;
       
        do{
                System.out.print("Press 1 to read from a file\n");
                System.out.print("Press 2 to write to a file\n");
                System.out.print("Press 3 to exit\n");
                System.out.print("Enter choice: ");
                choice = scan.nextInt();
                
                switch(choice){
                    case 1:
                        fileMaker.readFile();
                        break;
                    case 2:
                        System.out.println("Enter text to write to the file (tye 'exit' to stop)");
                        String text = "";
                        
                        while(true){
                            String input = scan.nextLine();
                            
                            if(input.equals("exit"))
                                break;
                            
                            text += input + "\n";
                        }
                        
                        fileMaker.writeFile(text);
                        
                        System.out.println("Text written to the file.");
                        break;
                    case 3:
                        System.out.println("Exiting program");
                        break;
                    default:
                        System.out.println("Invalid chocie. Please enter 1, 2, or 3.");
                }
        }while(choice != 3);
        
    }
}
