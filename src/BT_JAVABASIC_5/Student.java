package BT_JAVABASIC_5;

import java.util.*;

public class Student {
    public void addStudent() {
        List<String> studentID = new ArrayList<String>();
        studentID.add("MSV01");
        studentID.add("MSV02");
        studentID.add("MSV03");

        List<String> nameStudent = new ArrayList<String>();
        nameStudent.add("Thao");
        nameStudent.add("Hoa");
        nameStudent.add("Trung");

        List<Integer> ageStudent = new ArrayList<Integer>();
        ageStudent.add(18);
        ageStudent.add(19);
        ageStudent.add(19);

        List<String> addressStudent = new ArrayList<String>();
        addressStudent.add("Ha Noi");
        addressStudent.add("Thai Binh");
        addressStudent.add("Ho Chi Minh");

        for (int i = 0; i < studentID.size(); i++){
            System.out.println("Student No.: " + (i + 1));
            System.out.println("\t StudentID: " + studentID.get(i));
            System.out.println("\t Name: " + nameStudent.get(i));
            System.out.println("\t Age: " + ageStudent.get(i));
            System.out.println("\t Address: " + addressStudent.get(i));
            System.out.println("=========================");
        }

    }

    public static void main(String[] args) {
        Student studentList = new Student();
        studentList.addStudent();
    }
}
