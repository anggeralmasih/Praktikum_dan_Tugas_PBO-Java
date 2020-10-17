package com.Angger.tugasmodul2.No2;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class Kucing extends Binatang {
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void getNama(){
        System.out.println("Nama Binatang : " + nama);
    }

    public void meong(){
        System.out.println("Binatang ini dapat mengeong.");
    }
}
