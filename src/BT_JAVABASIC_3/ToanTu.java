package BT_JAVABASIC_3;

public class ToanTu {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 10;

        System.out.println("Toan tu VA:  " + ((a < b) && (b < c)));
        System.out.println("Toan tu HOAC: " + ((a > b) || (a >= c)));
        System.out.println("So sanh >: " + (b > c));
        System.out.println("So sanh <: " + (b < a));
        System.out.println("So sanh ==: " + (a == c));
    }


}
