package com.orcunasik._1_part1_javatypes;

public class _02_Variables {
    public static void main(String[] args) {
        //Veri değişken isimlerini yazarken;
        //veri isimlendirmeleri;
        //1-) isim veya sıfat, zamir kullanmamız lazım.
        //Anlamlı ve açıklayıcı isimler seçmemiz lazım.
        int schoolNumber = 34;
        System.out.println(schoolNumber);
        schoolNumber = 35;
        System.out.println(schoolNumber);

        //2-) _ veya $ ile başlayabilirsiniz
        int _schoolNumber = 45;
        System.out.println(_schoolNumber);
        int $schoolNumber = 95;
        System.out.println($schoolNumber);

        //3-) sayı ile bitebilir
        int schoolNumber123 = 63;
        System.out.println(schoolNumber123);
        /*
            4-) sayı ile başlanmaz
            5-) _ veya $ dışında özel simgelerle başlanmaz
            6-) değişken isimleri camelCase kuralına göre yazılır
         */
        //yazamazsınız
        //int schoolNumber = 11; //aynı isimde yazamazsınız
        //int 44schoolNumber = 11; //sayıyla yazamazsınız
        //int ~schoolNumber = 11; //özel simgeyle ($ _ hariç) yazamazsınız
        //int `` schoolNumber = 11; //özel simgeyle ($ _ hariç) yazamazsınız
        //int school number = 66; //değişkenlerde arada boşluk bırakılmaz

        //SABIT
        final int MAX_STUDENT = 100;
        System.out.println(MAX_STUDENT);
    }
}