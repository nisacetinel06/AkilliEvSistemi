package org.example;

public class GuvenlikKamerasi extends Cihaz{
    public GuvenlikKamerasi(String isim){
        super(isim);
    }
    public void izle(){
        if (acik){
            System.out.println(isim+" izleniyor...");
        }
        else {
            System.out.println(isim+" kapalı! Önce açmalısınız.");
        }
    }
}
