/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author L12X17W13
 */
import java.util.*;
import java.io.*;
class MakeFile implements FileMaker {
    private String fileName;
    
    @Override
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public String getFileName(){
        return fileName;
    }
    
    @Override
    public void writeFile(String fileContent){
            try{
                File file = new File(getFileName());
                FileWriter fw = new FileWriter(file, true);

                fw.write(fileContent + "\n");
                fw.close();
            } catch(IOException e) {
                System.out.println("Error : " + e);
            }
        
    }
    
    @Override
    public void readFile(){
        try{
            File file = new File(getFileName());
            Scanner scanFile = new Scanner(file);
            System.out.print("Contens of the file:\n");
            while(scanFile.hasNext()){
                System.out.println(scanFile.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error : " + e);
        }
    }
    
}
