package com.Angger.tugasmodul2.No1;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Sains");
        Club club3 = new Club("Pencari Jodoh", "Kekurangan anggota karena cringe.");
        Club club4 = new Club("Bola Basket", 1999 , "Lapangan basket GOR Satria.");
        Club club5 = new Club("Mix Martial Art", 1998,"GOR Satria", 5, "Berjaung Bersama!");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
