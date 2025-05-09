/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadb;

/**
 *
 * @author L12X17W13
 */
public class Students {
    String id, fname, lname, mname, age;
    
    public Students(String id, String lname, String fname, String mname, String age){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.age = age;
    }
    
    
    public String getLname(){
        return this.lname;
    }
    
    public String getMname(){
        return this.mname;
    }
    
    public String getFname(){
        return this.fname;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getAge(){
        return this.age;
    }
}
