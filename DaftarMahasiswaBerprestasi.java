package com.jobsheet6;
public class DaftarMahasiswaBerprestasi {
    Mahasiswa[] listMahasiswa = new Mahasiswa[5];
    int idx;
    void tambah (Mahasiswa m) {
        if (idx < listMahasiswa.length) {
            listMahasiswa[idx] = m;
            idx++;
        }else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    void tampil () {
        for (Mahasiswa m : listMahasiswa) {
            m.tampil();
            System.out.println("-------------------------");
        }
    }
    void bubbleSort () {
        for (int i = 0; i < listMahasiswa.length - 1; i++) {
            for (int j = 1; j < listMahasiswa.length - i; j++) {
                if (listMahasiswa[j].ipk > listMahasiswa[j - 1].ipk) {
                    Mahasiswa tmp = listMahasiswa[j];
                    listMahasiswa[j] = listMahasiswa[j - 1];
                    listMahasiswa[j -1] = tmp;
                }
            }
        }
    }
    void selectionSort () {
        for (int i = 0; i < listMahasiswa.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMahasiswa.length; j++) {
                if (listMahasiswa[j].ipk < listMahasiswa[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMahasiswa[idxMin];
            listMahasiswa[idxMin] = listMahasiswa[i];
            listMahasiswa[i] = tmp;
        }
    }
    void insertionSort () {
        for (int i = 1; i < listMahasiswa.length; i++) {
            Mahasiswa temp = listMahasiswa[i];
            int j = i;
            while (j > 0 && listMahasiswa[j - 1].ipk > temp.ipk) {
                listMahasiswa[j] = listMahasiswa[j -1];
                j--;
            }
            listMahasiswa[j] = temp;
        }
    }
    void insertionSortDesc () {
        for (int i = 1; i < listMahasiswa.length; i++) {
            Mahasiswa buffer = listMahasiswa[i];
            int j = i;
            while (j > 0 && listMahasiswa[j - 1].ipk < buffer.ipk) {
                listMahasiswa[j] = listMahasiswa[j - 1];
                j--;
            }
            listMahasiswa[j] = buffer;
        }
    }
}