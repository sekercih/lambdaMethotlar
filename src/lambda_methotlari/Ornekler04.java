package lambda_methotlari;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ornekler04 {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "  Limon"},
                {"Havuc , Erik"}
        };
        System.out.println("tumList(arr) = " + tumList(arr));
    }
    // S1 : tum elemanlari list yapayim
    public static List<String> tumList(String[][] arr){
        return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());
    }
    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim yazdiralim
    //k ile bitenlerin sonuna '*' ekleyelim

}


