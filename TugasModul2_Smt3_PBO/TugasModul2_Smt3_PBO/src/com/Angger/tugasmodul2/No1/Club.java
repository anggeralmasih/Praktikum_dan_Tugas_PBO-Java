package com.Angger.tugasmodul2.No1;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    //Overloading dengan Constructure 0 pr.
    public Club() {
        this.nama = "Tidak diketahui.";
        this.tahunBerdiri = 0;
        this.stadion = "Tidak diketahui.";
        this.juaraUcl = 0;
        this.deskripsi = "Tidak diketahui.";
    }

    //Overloading dengan Constructure 1 pr.
    public Club(String nama) {
        this.nama = nama;
        this.tahunBerdiri = 0;
        this.stadion = "Tidak diketahui.";
        this.juaraUcl = 0;
        this.deskripsi = "Tidak diketahui.";
    }

    //Overloading dengan Constructure 2 pr.
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = 0;
        this.stadion = "Tidak diketahui.";
        this.juaraUcl = 0;
        this.deskripsi = deskripsi;
    }

    //Overloading dengan Constructure 3 pr.
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = 0;
        this.deskripsi = "Tidak diketahui.";
    }

    //Overloading dengan Constructure 5 pr.
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        System.out.println("-------Identitas Club-------");
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Stadion \t\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi\t\t: " + deskripsi);
        System.out.println();
    }

}
