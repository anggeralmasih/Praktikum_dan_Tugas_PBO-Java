package com.Angger.tugasmodul2.No3;
//Anggeralmasih Wiiradika Rusmana || S1SE-03-B || 19104073

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMhs {
    public static void main(String[] args) throws IOException {
        BufferedReader bfRead=
                new BufferedReader(new InputStreamReader(System.in));

        String nama, status;
        int semester;

        System.out.println("======Pendataan Status Mahasiswa======");
        System.out.println("Mohon Masukkan : ");
        System.out.print("Nama Anda\t\t: ");
        nama = bfRead.readLine();

        System.out.print("Status Anda\t\t: ");
        status = bfRead.readLine();

        System.out.print("Lama Semester\t: ");
        semester = Integer.parseInt(bfRead.readLine());
        ////////////////////////////////////////////////////////////////////////////
        Mahasiswa mahasiswa = new Mahasiswa(nama, status, semester);
        mahasiswa.getStatus();
        System.out.println();

        String namaPacar;
        String lamaHubungan;

        System.out.println("Mohon Masukkan : ");
        System.out.print("Nama Pacar Anda\t: ");
        namaPacar = bfRead.readLine();

        System.out.print("Lama Hubungan\t: ");
        lamaHubungan = bfRead.readLine();
        /////////////////////////////////////////////////////////////////////////////
        Mahasiswa pacar = new Pacar(nama, status, semester, namaPacar, lamaHubungan);
        pacar.getStatus();
    }
}
