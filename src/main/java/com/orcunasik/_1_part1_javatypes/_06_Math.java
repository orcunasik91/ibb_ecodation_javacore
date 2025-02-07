package com.orcunasik._1_part1_javatypes;

public class _06_Math {
    public static void main(String[] args) {
        //Nan : Not A Number
        System.out.println("en küçük: " + Math.min(3,10));
        System.out.println("En BÜYÜK: " + Math.max(3,10));
        System.out.println("Mutlak Değer: " + Math.abs(-5));
        System.out.println("Karekök: " + Math.sqrt(25));
        System.out.println("Karekök: " + Math.sqrt(+25));
        System.out.println("Karekök: " + Math.sqrt(Math.abs(-25)));
        System.out.println("Üslü: " + Math.pow(2,5));
        System.out.println("Alta yuvarlama: " + Math.floor(2.9));
        System.out.println("Üste yuvarlama: " + Math.ceil(2.1));
        System.out.println("Üste yuvarlama: " + Math.ceil(2.00001));
        System.out.println("Ortalama yuvarlama: " + Math.round(3.4)); // x <= 4 ise aşağı yuvarla
        System.out.println("Ortalama yuvarlama: " + Math.round(3.5)); // x >= 5 ise yukarı yuvarla
        System.out.println("Pi sayısı: " + Math.PI);
        System.out.println("E sayısı: " + Math.E);
        System.out.println("Triginometrik Sinüs: " + Math.sin(1));
        System.out.println("Triginometrik Sinüs simetri: " + Math.asin(1));
        System.out.println("Triginometrik Cosinüs: " + Math.cos(1));
        System.out.println("Triginometrik Tanjat: " + Math.tan(1));

    }
}
