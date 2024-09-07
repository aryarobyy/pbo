/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TambahKurang;

/**
 *
 * @author USER
 */
public class Action {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penambahan penambahan = new Penambahan();
        Pengurangan pengurangan = new Pengurangan();
        
        
        System.out.println("Pertambahan x : " + penambahan.x);
        System.out.println("Pertambahan y : " + penambahan.y);
        System.out.println("Pertambahan z : " + penambahan.z );

        
        System.out.println("Pengurangan x : " + pengurangan.x);
        System.out.println("Pengurangan y : " + pengurangan.y);
        System.out.println("pengurangan z : " + pengurangan.z );


    }
    
}
