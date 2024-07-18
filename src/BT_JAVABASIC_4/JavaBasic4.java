package BT_JAVABASIC_4;

import java.util.ArrayList;
import java.util.List;

public class JavaBasic4 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("So chan: ");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("\t" + i);
                count++;
            }
        }
        int[] oddNumber = new int[count];
        int j = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                oddNumber[j] = i;
                j++;
            }
        }

        System.out.println("Phan tu cua mang");
        for (Integer number : oddNumber){
            System.out.println("\t" + number);
        }
    }
}
