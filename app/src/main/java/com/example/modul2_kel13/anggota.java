package com.example.modul2_kel13;

public class anggota {
    int Muka;
    String Nama;
    String Nim;

    public anggota(int muka, String nama, String nim){
        Muka = muka;
        Nama = nama;
        Nim = nim;
    }

    public int getMuka() {
        return Muka;
    }

    public void setMuka(int muka) {
        Muka = muka;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        Nim = nim;
    }
}
