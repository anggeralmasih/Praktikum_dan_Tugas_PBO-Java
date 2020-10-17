package com.Angger.tugasmodul2.No2;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

public class MainBinatang {
    public static void main(String[] args) {
        Binatang superClass = new Binatang();
        Burung subClass1 = new Burung("Burung");
        Ikan subClass2 = new Ikan("Ikan");
        Kucing subClass3 = new Kucing("Kucing");

        System.out.println("SuperClass : ");
        superClass.Makan("Serigala");
        superClass.Tidur("Serigala");
        System.out.println();

        System.out.println("SubClass 1 : ");
        subClass1.getNama();
        subClass1.Makan(subClass1.nama);
        subClass1.Tidur(subClass1.nama);
        subClass1.terbang();
        System.out.println();

        System.out.println("SubClass 2 : ");
        subClass2.getNama();
        subClass2.Makan(subClass2.nama);
        subClass2.Tidur(subClass2.nama);
        subClass2.berenang();
        System.out.println();

        System.out.println("SubClass 3 : ");
        subClass3.getNama();
        subClass3.Makan(subClass3.nama);
        subClass3.Tidur(subClass3.nama);
        subClass3.meong();
        System.out.println();
    }
}
