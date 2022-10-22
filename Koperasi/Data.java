/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;

/**
 *
 * @author Nico Septian
 */
public class Data {


class anggotakoperasi{
    String Nama;
    String Nik;
    String Alamatlengkap;

    anggotakoperasi(String inputNama, String inputNik, String inputAlamat){
        Nama = inputNama;
        Nik = inputNik;
        Alamatlengkap = inputAlamat;

        System.out.println(Nama);
        System.out.println(Nik);
        System.out.println(Alamatlengkap);
    }
}

public class Quiz {
    public Quiz(String[] args) throws Exception {
        
        anggotakoperasi anggotakoperasi1 = new anggotakoperasi("Julian","327530025559","Bekasi");
        anggotakoperasi anggotakoperasi2 = new anggotakoperasi("Alexa","32751220158","Jakarta");
        
    }
}
    
}

    
}
