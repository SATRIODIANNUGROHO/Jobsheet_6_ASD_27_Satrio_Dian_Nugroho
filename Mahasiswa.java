package com.jobsheet6;
public class Mahasiswa {
    String nama;
    int tahunMasuk, umur;
    double ipk;
    Mahasiswa (String n, int t, int u, double i) {
        nama = n;
        tahunMasuk = t;
        umur = u;
        ipk = i;
    }
    void tampil () {
        System.out.println("Nama\t\t: " + (nama));
        System.out.println("Tahun Masuk\t: " + (tahunMasuk));
        System.out.println("Umur\t\t: " + (umur));
        System.out.println("IPK\t\t: " + (ipk));
    }
}