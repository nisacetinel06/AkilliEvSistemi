package org.example;

public class Main {
    public static void main(String[] args) {
        Klima klima=new Klima("Salon Kliması");
        Lamba lamba=new Lamba("Mutfak Lambası");
        GuvenlikKamerasi guvenlikKamerasi=new GuvenlikKamerasi("Bahçe Kamerası");

        klima.ac();;
        klima.sicaklikAyarla(18);

        lamba.ac();
        lamba.parlaklikAyarla(75);

        guvenlikKamerasi.ac();
        guvenlikKamerasi.izle();
    }
}