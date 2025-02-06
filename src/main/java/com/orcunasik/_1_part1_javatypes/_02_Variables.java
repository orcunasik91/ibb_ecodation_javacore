package com.orcunasik._1_part1_javatypes;

public class _02_Variables {
    public static void main(String[] args) {
        //Veri değişken isimlerini yazarken;
        /*

            2-) _ veya $ ile başlayabilirsiniz
            3-) sayı ile bitebilir
            4-) sayı ile başlanmaz
            5-) _ veya $ dışında özel simgelerle başlanmaz
         */
        //veri isimlendirmeleri;
        //1-) isim veya sıfat, zamir kullanmamız lazım.
        int schoolNumber = 34;
        System.out.println(schoolNumber);
        schoolNumber = 35;
        System.out.println(schoolNumber);
        int _schoolNumber = 45;
        System.out.println(_schoolNumber);
        int $schoolNumber = 95;
        System.out.println($schoolNumber);

        //yazamazsınız
        //int schoolNumber = 11; //aynı isimde yazamazsınız
        //int 44schoolNumber = 11; //sayıyla yazamazsınız
        //int ~schoolNumber = 11; //özel simgeyle ($ _ hariç) yazamazsınız
        //int `` schoolNumber = 11; //özel simgeyle ($ _ hariç) yazamazsınız
    }
}