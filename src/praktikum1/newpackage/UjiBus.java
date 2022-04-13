/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.newpackage;

/**
 *
 * @author Fafa
 */
public class UjiBus {
    public static void main(String[] args) {
        int password;
        
    Bus busMini = new Bus(40);
    busMini.cetak();
    
    busMini.getPenumpang(100);
    busMini.cetak();
    
    busMini.getPenumpang(90);
    busMini.cetak();
    
        System.out.println("Rata-rata Penumpang : "+busMini.getaverage());
    }
}
