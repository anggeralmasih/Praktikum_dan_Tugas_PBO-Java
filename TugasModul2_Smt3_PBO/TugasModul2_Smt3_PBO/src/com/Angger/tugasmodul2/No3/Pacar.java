package com.Angger.tugasmodul2.No3;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class Pacar extends Mahasiswa{
    public String namaPacar;
    public String lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }
}
