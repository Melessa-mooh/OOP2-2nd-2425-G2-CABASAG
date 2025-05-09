/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author L12X17W13
 */

import java.util.*;
import java.io.*;

public class SubClass implements Parent {
    private ArrayList<String> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    private String filename;
    
    @Override 
    public void setFileName(String filename){
        this.filename = filename;
    }
    
    @Override 
    public String getFileName(){
        return filename;
    }
    
    @Override
    public void add(String str){
        list.add(str);
        System.out.println("Value successfully added!");
        writeFile();
    }
    
    @Override
    public void delete(){
         while(true){
            try{
                System.out.print("Enter value to delete: ");
                String dl = scan.nextLine();
                if(list.contains(dl)){
                    list.remove(dl);
                    System.out.println("Value successfully deleted!");
                    break;
                }
            } catch (Exception e){
                System.out.println("Value does not exist!");
                scan.nextLine();
            }
        }
         
        writeFile();
    }
    
    @Override
    public void edit(){
        while(true){
            try{
                System.out.print("Enter index to update: ");
                int index = scan.nextInt();
                list.get(index);
                
                if(index>=0 && index < list.size()){
                    scan.nextLine();
                    System.out.print("Enter updated value: ");
                    list.set(index,scan.nextLine());
                    System.out.println("Value successfully updated!");
                    break;
                }
            } catch(Exception e){
                    System.out.println("Invald index number!");
                    scan.nextLine();
            }
        }
        writeFile();
    }
    @Override 
    public void writeFile(){
        try{
            File file = new File(getFileName());
            FileWriter fw = new FileWriter(file);
            
            for(String temp: list){
                fw.write(temp + "\n");
            }
            
            fw.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
    public void readFile(){
        try{
            File file = new File(getFileName());
            Scanner fileScan = new Scanner(file);
            
            System.out.println("The contents of the file:");
            int i = 0;
            while(fileScan.hasNext()){
                System.out.printf("%d - " + fileScan.nextLine(), i);
                System.out.println();
                i++;
            }
        } catch(FileNotFoundException e){
            System.out.println("Error : " + e);
        }
    }
    
    public void readFileForArray(){
        try{
            File file = new File(getFileName());
            Scanner fileScan = new Scanner(file);
            
            System.out.println("The contents of the file:");
            while(fileScan.hasNext()){
                list.add(fileScan.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("Error : " + e);
        }
    }
    
}
