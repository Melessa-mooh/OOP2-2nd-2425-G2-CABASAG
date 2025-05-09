/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling;

/**
 *
 * @author L12X17W13
 */
import java.util.*;

public class FileHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        SubClass sb = new SubClass();
        sb.setFileName("fileHandling.txt");
        sb.readFileForArray();
        
        do{
            System.out.println("Press 1 - Add");
            System.out.println("Press 2 - Edit");
            System.out.println("Press 3 - Delete");
            System.out.println("Press 4 - Display");
            System.out.println("Press 5 - Exit");
            
            while(true){
                try{
                    System.out.print("Enter choice: ");
                    choice = scan.nextInt();
                    scan.nextLine();
                    if(choice>0 && choice <=5){
                        break;
                    }else{
                        System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    }
                } catch(Exception e){
                    System.out.println("Invalid input!");
                    scan.nextLine();
                }
            }
            
            scan.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter value to add: ");
                    String str = scan.nextLine();
                    sb.add(str);
                    break;
                case 2:
                    sb.edit();
                    break;
                case 3:
                    sb.delete();
                    break;
                case 4:
                    sb.readFile();
                    break;    
                case 5:
                    System.out.println("Good Bye!");
                    break;    
            }
        }while(choice!=5);
        
    }
    
}
