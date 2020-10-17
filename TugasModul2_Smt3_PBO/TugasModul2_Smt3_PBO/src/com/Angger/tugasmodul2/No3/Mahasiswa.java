package com.Angger.tugasmodul2.No3;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class Mahasiswa {
    public String nama;
    public String status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus(){
        System.out.println("Status : " + status);
    }
}
