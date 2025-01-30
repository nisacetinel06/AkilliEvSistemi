package org.example;

public class Cihaz {
    protected String isim;
    protected boolean acik;

    public Cihaz(String isim){
        this.isim=isim;
        this.acik=false;
    }
    public void ac(){
        if (!acik){
            acik=true;
            System.out.println(isim+" açıldı.");
        }
        else{
            System.out.println(isim+" zaten açık");
        }
    }
    public void kapat(){
        if (acik){
            acik=false;
            System.out.println(isim+" kapatıldı.");
        }
        else {
            System.out.println(isim+" zaten kapalı.");
        }
    }
}
