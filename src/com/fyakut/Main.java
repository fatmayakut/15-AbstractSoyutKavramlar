package com.fyakut;

public class Main {

    /**
     * abstract class :soyut sınıflar eksik sınıf olarak nitelendirilebilir.
     * kendisinden türetilmesi mümkün alt sınıflar için super class konumundadır.
     * bu sınıflara ait nesne oluşturulmaz
     * bu sınıfta olşan metotlardan bir tanesinini gövdesi yazılmayacak. abstract olacak
     *
     *kullnma amacı:
     * bu sınıflar nesnelerimiz arasında ortak özellik yada metotlar ile
     * fazla kod kullnamdadan diğer sınıflardan soyutlanmaya yarar
     * soyut sınıftan baska bir soyut sınıf olusabilir.
     * static metotlar soyut metod olarak tanımlanamaz.
     * soyut metot olmadan soyut sınıf tanımlanamaz
     * is a ilişkisi olmalı
     * @param args
     */

    public static void main(String[] args) {
        Araba f=new Ford();
        f.setAgirlik(5);
        f.setRenk("sari");
        f.setModel("bmv");
        goster(f);
        f.saatBenzinyakma();


    }


        public static void goster(Araba a){
            System.out.println("agırlık:");
            System.out.println("renk:");
            System.out.println("model:");
            System.out.println("benzin yakma:"+a.saatBenzinyakma());

        }


}
