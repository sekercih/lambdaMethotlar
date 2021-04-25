package lambda_methotlari;
import java.util.*;
import java.util.stream.Collectors;

public class Ornekler03 {
   // Arraylerde Stream kullanabilmek icin 2 yol vardir
// 1) Stream <Integer> isim=StreamOf(cevrilecek olan)
// 2) Arrays.stream(arr).


        public static void main(String[] args) {
            int arr [] ={1,5,-5,6,12,-8,9,3,4};
            ort1(arr);
        }
        //S1: arrayin elemanlarini bir liste yazdiralim
        //public static List<Integer> listele(int [] arr) {
            //return Arrays.stream(arr).collect(Collectors.toList());
            // }
            //S2: Arrayin elemanlarini toplamini bulalim

public static void ort1(int[]topl){
    System.out.println("Arrays.stream(topl).average() = " + Arrays.stream(topl).average());
}
            // S3: Array in elemanlarinin ortalamasini bulalim


        }