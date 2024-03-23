package com.jobsheet6;
import java.util.Scanner;
public class HotelMain {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Scanner sc = new Scanner(System.in);
        Hotel h1 = new Hotel("AKASHA HOTEL", "Malang", 400000d, (byte)2);
        Hotel h2 = new Hotel("BELMOND HOTEL", "Kediri", 450000d, (byte)1);
        Hotel h3 = new Hotel("CHAKRA HOTEL", "Yogyakarta", 550000d, (byte)4);
        Hotel h4 = new Hotel("DUXTON HOTEL", "Surabaya", 750000d, (byte)3);
        Hotel h5 = new Hotel("EMPORIUM HOTEL", "Surabaya", 800000d, (byte)5);
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        boolean kondisi = true;
        while(kondisi) {
            System.out.println("\n===================( MENU )===================\n");
            System.out.println("1. Tampilkan Hotel\n \n2. Filter Hotel\n \n3. Keluar");
            System.out.println("\n==============================================");
            System.out.print("\nMasukkan Opsi Pilihan : ");
            int opsi1 = sc.nextInt();
            if (opsi1 == 1) {
                list.tampilAll();
            }else if (opsi1 == 2) {
                innerloop1:
                while(true){
                    System.out.println("\n==================( FILTER )==================\n");
                    System.out.println("1. Urutkan Berdasarkan Harga\n \n2. Urutkan Berdasarkan Bintang\n \n3. Kembali");
                    System.out.println("\n==============================================");
                    System.out.print("\nMasukkan Opsi Pilihan : ");
                    int opsi2 = sc.nextInt();
                    if (opsi2 == 1) {
                        System.out.println("\n================( BUBBLE SORT )===============\n");
                        list.bubbleSortHarga();
                        list.tampilAll();
                        System.out.println("\n==============( SELECTION SORT )==============\n");
                        list.selectionSortHarga();
                        list.tampilAll();
                    }else if (opsi2 == 2) {
                        System.out.println("\n================( BUBBLE SORT )===============\n");
                        list.bubbleSortBintang();
                        list.tampilAll();
                        System.out.println("\n==============( SELECTION SORT )==============\n");
                        list.selectionSortBintang();
                        list.tampilAll();
                    }else if (opsi2 == 3) {
                        break innerloop1;
                    }else {
                        System.out.println("\n----------------------------------------------");
                        System.out.println("\nOpsi Pilihan Tidak Tersedia");
                        System.out.println("\n----------------------------------------------");
                    }
                }
            }else if (opsi1 == 3) {
                kondisi = false;
            }else {
                System.out.println("\n----------------------------------------------");
                System.out.println("\nOpsi Pilihan Tidak Tersedia");
                System.out.println("\n----------------------------------------------");
            }
        }
    }
}