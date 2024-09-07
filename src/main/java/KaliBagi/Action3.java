/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KaliBagi;

/**
 *
 * @author USER
 */
public class Action3 {
    
     public static void main(String[] args) {
        int angka = 10;

        Kali kali = new Kali();
        Bagi bagi = new Bagi();

        int hasilKali = kali.Kali(angka);
        System.out.println(angka + " dikali 2 = " + hasilKali);

        int hasilBagi = bagi.Bagi(angka);
        System.out.println(angka + " dibagi 2 = " + hasilBagi);
    }
}
