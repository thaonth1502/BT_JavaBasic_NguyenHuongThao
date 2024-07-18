package BT_JAVABASIC_5;

import java.util.ArrayList;
import java.util.List;

public class JavaBasic4 {
    public static void main(String[] args) {
        List<Integer> oddNumber = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                oddNumber.add(i);
            }
        }
        System.out.println("Phan tu mang");
        for (Integer odd : oddNumber){
            System.out.println(odd);
        }
    }
}
