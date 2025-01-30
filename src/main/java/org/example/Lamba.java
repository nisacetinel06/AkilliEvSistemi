package org.example;

public class Lamba extends Cihaz{
    private int parlaklik;

    public Lamba(String isim){
        super(isim);
        this.parlaklik=50;
    }
    public void parlaklikAyarla(int yeniParlaklik){
        if (acik){
            if (yeniParlaklik>=0 && yeniParlaklik<=100){
                this.parlaklik=yeniParlaklik;
                System.out.println(isim+" parlaklık ayarlandı: "+yeniParlaklik+" %");
            }
            else{
                System.out.println("Geçersiz parlaklık seviyesi! 0-100 arası olmalı.");
            }
        }
        else {
            System.out.println(isim+" kapalı! Önce açmalısınız.");
        }
    }
}
