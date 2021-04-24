package lambda_methotlari;

import java.util.HashSet;
import java.util.Set;

public class Ornekler01 {

    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        System.out.println(ints);
        // Getting the Error in next line
        ints.removeIf(i->(i%2==0));
        System.out.println(ints);
    }
}
