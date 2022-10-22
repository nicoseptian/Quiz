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
public class Datakoperasi {

    private String Nama;
    private String NIK;
    private String Alamat;
    private String Telepon;
    
class Anggotakoperasi{
    
    String Nama;
    String NIK;
    String Alamat;
    String Telepon;

    
    Anggotakoperasi(String Nama, String NIK, String Alamat, String Telepon){
        this.Nama = Nama;
        this.NIK = NIK;
        this.Alamat = Alamat;
        this.Telepon = Telepon;
    
    }
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

        public String getNama() {
            return Nama;
        }

        public String getNIK() {
            return NIK;
        }

        public String getAlamat() {
            return Alamat;
        }

        public String getTelepon() {
            return Telepon;
        }
    }

       

