/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity7;

/**
 *
 * @author L12X17W13
 */
interface FileMaker {
    void setFileName(String fileName);
    String getFileName();
    
    void writeFile(String fileContent);
    void readFile();
}
