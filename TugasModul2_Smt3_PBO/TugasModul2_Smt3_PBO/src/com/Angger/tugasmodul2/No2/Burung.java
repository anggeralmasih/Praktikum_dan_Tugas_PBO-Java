package com.Angger.tugasmodul2.No2;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class Burung extends Binatang {

    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void getNama(){
        System.out.println("Nama Binatang : " + nama);
    }

    public void terbang(){
        System.out.println("Binatang ini dapat terbang di langit.");
    }
}
