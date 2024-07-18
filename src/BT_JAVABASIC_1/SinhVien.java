package BT_JAVABASIC_1;

public class SinhVien {
    String name = "Nguyen Thi Huong Thao";
    static int age = 30;

    public void showAddress(){
        String address = "Cau Giay - Hanoi";
        System.out.println("Address: " + address);
    }


    public static void main(String[] args) {
        System.out.println("No.: " + ThongTin.MSV);
        System.out.println("Name: " + ThongTin.name);
        System.out.println("Age: " + ThongTin.age);
        System.out.println("Address: " + ThongTin.address);

        System.out.println("--------------------------");

        SinhVien sinhVien = new SinhVien();
        System.out.println("Name: " + sinhVien.name);
        System.out.println("Age: " + SinhVien.age);
        sinhVien.showAddress();

    }
}
