package BT_JAVABASIC_2;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public float Multiply(float a, float b){
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 number: " + calculator.sum(5, 7));
        System.out.println("Multiply of 2 number: " + calculator.Multiply(3.5F, 6.3F));
    }
}
