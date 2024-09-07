/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banding;

/**
 *
 * @author USER
 */
public class HasilBanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int age = 36;
        boolean hasilBanding1 = age < 25;    
        boolean hasilBanding2 = age != 26;  

        System.out.println("Apakah age kurang dari 25? " + hasilBanding1);
        System.out.println("Apakah age tidak sama dengan 26? " + hasilBanding2);
    }
    
}
