package app;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = ".co.com";

    Email(String firstName, String lastname){
        this.firstName = firstName;
        this.lastName = lastname;
        this.department = setDepartment();
        this.password = randomPassword(10);
        this.email = firstName.toLowerCase() +
            "." +
            lastName.toLowerCase() +
            "@" +
            this.department.toLowerCase() +
            this.companySuffix;
        printInfo();
    }

    private void printInfo() {
        System.out.println("Email created for " + this.firstName + " " + this.lastName);
        System.out.println("Dept: " + this.department);
        System.out.println("PW: " + this.password);
        System.out.println("Email: " + this.email);
    }

    private String setDepartment() {
        System.out.print("Dept Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Dept Code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) return "Sales";
        else if (deptChoice == 2) return "Development";
        else if (deptChoice == 3) return "Accounting";
        else return "None";
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public int getMailboxCapacity() {
        System.out.println("MailBox Capacity: " + this.mailboxCapacity);
        return this.mailboxCapacity;
    }
    public void setMailboxCapacity(int num) {
        this.mailboxCapacity = num;
    }
    public String getAltEmail() {
        System.out.println("Alt Email: " + this.alternateEmail);
        return this.alternateEmail;
    }
    public void setAltEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    public String getPassword() {
        System.out.println("Password: " + this.password);
        return this.password;
    }
    public void changePassword(String np) {
        this.password = np;
    }
}