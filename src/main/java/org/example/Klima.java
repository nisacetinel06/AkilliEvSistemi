package org.example;

public class Klima extends Cihaz{
    private int sicaklik;

    public Klima(String isim){
        super(isim);
        this.sicaklik=24;
    }
    public void sicaklikAyarla(int yeniSicaklik){
        if (acik){
            this.sicaklik=yeniSicaklik;
            System.out.println(isim+" sıcaklık ayarlandı: "+yeniSicaklik+ "°C");
        }
        else {
            System.out.println(isim+" kapalı! Önce açmalısınız.");
        }
    }
}
