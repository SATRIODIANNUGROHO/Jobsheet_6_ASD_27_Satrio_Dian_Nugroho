package com.jobsheet6;
public class HotelService {
    Hotel[] listHotel = new Hotel[5];
    int idx;
    void tambah(Hotel h) {
        if (idx < listHotel.length) {
            listHotel[idx] = h;
            idx++;
        }else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    void tampilAll() {
        for (Hotel h : listHotel) {
            h.tampil();
        }
    }
    void bubbleSortHarga() {
        for (int baris = 0; baris < listHotel.length - 1; baris++) {
            for (int kolom = 1; kolom < listHotel.length - baris; kolom++) {
                if (listHotel[kolom].Harga < listHotel[kolom - 1].Harga) {
                    Hotel buffer = listHotel[kolom];
                    listHotel[kolom] = listHotel[kolom - 1];
                    listHotel[kolom - 1] = buffer; 
                }
            }
        }
    }
    void selectionSortHarga() {
        for (int baris = 0; baris < listHotel.length - 1; baris++) {
            int idxMin = baris;
            for (int kolom = baris + 1; kolom < listHotel.length; kolom++) {
                if (listHotel[kolom].Harga < listHotel[idxMin].Harga) {
                    idxMin = kolom;
                }
            }
            Hotel buffer = listHotel[idxMin];
            listHotel[idxMin] = listHotel[baris];
            listHotel[baris] = buffer;
        }
    }
    void bubbleSortBintang() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            for (int j = 1; j < listHotel.length - i; j++) {
                if (listHotel[j].Bintang > listHotel[j -1].Bintang) {
                    Hotel buffer = listHotel[j];
                    listHotel[j] = listHotel[j - 1];
                    listHotel[j - 1] = buffer;
                }
            }
        }
    }
    void selectionSortBintang() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listHotel.length; j++) {
                if (listHotel[j].Bintang > listHotel[idxMin].Bintang) {
                    idxMin = j;
                }
            }
            Hotel buffer = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = buffer;
        }
    }
}