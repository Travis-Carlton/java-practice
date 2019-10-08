package studentdb;

import studentdb.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private int studentCount;
    private List<Student> students = new ArrayList<Student>();

    Admin(int numStudents) {
        this.studentCount = numStudents;
        for (int i = 0; i<numStudents; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter First Name: ");
            String name = input.next();
            System.out.print("Enter Last Name: ");
            String name2 = input.next();
            Student newStudent = new Student(name,name2);
            // System.out.println("hit");
            students.add(newStudent);
            // System.out.println("hit2");
            // System.out.println(newStudent.getFullName());
        }
        getStudents();
    }

    public void getStudents() {
        students.forEach((stu) -> {
            System.out.println(stu.getFullName());
        });
    }
}