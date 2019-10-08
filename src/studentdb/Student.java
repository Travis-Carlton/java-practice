package studentdb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> classes = new HashMap<String, Integer>();


    Student(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;

        this.addClasses();
        this.seeClasses();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    private void addClasses() {
        String[] classList = {"Math", "English", "Chemistry", "Physics"};
        // System.out.print("Class Selection:\n1: Math\n2: English\n3: Chemistry\n4:Add classes: ");
        for (String i: classList) {
            Scanner in = new Scanner(System.in);
            System.out.print("Add " + i + " to your classes?\nYes / No ");
            String confirm = in.next();
            int cost = 0;
            if (i == "Math")
                cost = 1000;
            else if (i == "English")
                cost = 500;
            else if (i == "Chemistry")
                cost = 1500;
            else if (i == "Physics")
                cost = 1250;
            if (confirm.equalsIgnoreCase("yes"))
                this.classes.put(i, cost);
            // else continue;
        }
    }
    private void seeClasses() {
        System.out.println(this.classes);
    }
}