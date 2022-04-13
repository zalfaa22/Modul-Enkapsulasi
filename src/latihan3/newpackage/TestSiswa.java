/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.newpackage;

/**
 *
 * @author Fafa
 */
public class TestSiswa {
    public static void main(String[] args) {
    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }  
}

