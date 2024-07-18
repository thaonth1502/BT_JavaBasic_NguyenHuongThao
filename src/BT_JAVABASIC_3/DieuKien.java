package BT_JAVABASIC_3;

public class DieuKien {
    static int number = 100;

    public void checkN(int n){

        if( n == number){
            System.out.println(n + " bằng " + number);
        }
        else if( n < number){
            System.out.println(n + " nhỏ hơn " + number);
        }
        else {
            System.out.println( n + " lớn hơn " + number);
        }
    }

    public static void main(String[] args) {
        DieuKien dieuKien = new DieuKien();
        dieuKien.checkN(5);
        dieuKien.checkN(110);
        dieuKien.checkN(100);
    }
}
