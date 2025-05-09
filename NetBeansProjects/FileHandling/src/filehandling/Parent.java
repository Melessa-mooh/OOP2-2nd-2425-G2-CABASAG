/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author L12X17W13
 */
interface Parent {
    void setFileName(String filename);
    String getFileName();
    
    void writeFile();
    void readFile();
    
    void add(String str);
    void delete();
    void edit();
}
