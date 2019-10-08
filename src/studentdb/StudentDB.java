package studentdb;

import studentdb.Admin;

import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Count: ");
        int studentCount = input.nextInt();
        Admin admin1 = new Admin(studentCount);
    }
}