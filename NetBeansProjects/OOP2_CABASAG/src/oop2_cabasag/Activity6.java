/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2_cabasag;

/**
 *
 * @author L12X17W13
 */
import java.util.*;
public class Activity6 {
    public static void main(String[] args) {
        ArrayList<String> personName = new ArrayList<>();
        
        personName.add("Melody");
        personName.add("Ann");
        personName.add("Garbo");
        
        personName.set(2, "Garbz");
        
        personName.remove("Melody");
        
        for(String names : personName){
            System.out.println(names);
        }
    }
}
