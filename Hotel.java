package com.jobsheet6;
import java.util.Locale;
import java.text.NumberFormat;
public class Hotel {
    Locale IDN = new Locale("ID","id");
    NumberFormat IDR = NumberFormat.getCurrencyInstance(IDN);
    String Nama;
    String Kota;
    double Harga;
    byte Bintang;
    Hotel(String n, String k, double h, byte b) {
        Nama = n;
        Kota = k;
        Harga = h;
        Bintang = b;
    }
    void tampil() {
        System.out.println("\n----------------------------------------------");
        System.out.println("\nNama\t\t: " + (Nama));
        System.out.println("\nKota\t\t: " + (Kota));
        System.out.println("\nHarga\t\t: " + (IDR.format(Harga)));
        System.out.println("\nBintang\t\t: " + (Bintang));
        System.out.println("\n----------------------------------------------");
    }
}