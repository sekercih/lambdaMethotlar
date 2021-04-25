package lambda_methotlari;

import java.util.*;
import java.util.stream.Collectors;

public class Ornekler02 {

        public static void main(String[] args) {
            List<String> list=new ArrayList<>();
            list.add("Java");
            list.add("ogrenmek");
            list.add("cok");
            list.add("eglencelidi");
            list.add("lambda");
            list.add("gelince");
            list.add("Daha");
            list.add("da");
            list.add("Cok");
            list.add("Eglenceli");
            list.add("Oldu");

            System.out.println(list); //[Java, ogrenmek, cok, eglencelidi, lambda, gelince, Daha, da, cok, Eglenceli, Oldu]
            System.out.println("dcIleBaslayanlar(list) = " + dcIleBaslayanlar(list));

            System.out.print("harfSirala(list) = " + harfSirala(list)+" ");
            lSil(list);
            System.out.println("eOlanlardan(list) = " + eOlanlardan(list));

            ılkTekrarYaz(list);
            ilkHarfBuyuk(list);
            System.out.println("uzunlukListesi(list) = " + uzunlukListesi(list));
        }
        // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String>dcIleBaslayanlar(List<String> liste){
            return liste.stream().filter(t->t.startsWith("c")||t.startsWith("d")).collect(Collectors.toList());
    }

        //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
        //S3: alfabedik  gore siralayalim
    public static List<String> harfSirala(List<String> sirali){
            return sirali.stream().sorted().collect(Collectors.toList());
    }
        //S4: tum 'l' leri silelim
    public static void lSil(List<String> lSilinecek){
            lSilinecek.stream().map(t->t.replace("l","")).forEach(System.out::println);
    }

        //S5 : icinde e olanlardan yeni bir list olusturunuz
    public static List<String> eOlanlardan(List<String> e){
            return e.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }
        // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void ılkTekrarYaz(List<String>tekrarYaz){
            tekrarYaz.stream().map(t->t.substring(0,1)+t.substring(0,1)+
                    t.substring(0,1)).forEach(t-> System.out.print(t+" "));
    }
        // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkHarfBuyuk(List<String > ilkHarfBuyuk){
            ilkHarfBuyuk.stream().map(t->t.substring(0,1).toLowerCase()+t.substring(1).toUpperCase()).
                    forEach(System.out::println);
    }
        // S8: uzunlugu 4 ve 6 olanlar haric bir dizi olusturunuz
    public static  List<String> uzunlukListesi(List<String>dortaltiHaric){
            return dortaltiHaric.stream().filter(t->t.length()!=4&&t.length()!=6).collect(Collectors.toList());
    }
}
