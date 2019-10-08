package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    String title = "Hello World";
    List<String> otherNames = new ArrayList<String>();

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the otherNames
     */
    public List<String> getOtherNames() {
        return otherNames;
    }
    public void setOtherNames(List<String> otherNames) {
        this.otherNames = otherNames;
    }
    public void addOtherNames(String name) {
        this.otherNames.add(name);
    }


    public void addOtherNames(String name, int num) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name(s): ");
        String input = in.next();
        System.out.println("You typed " + input);
    }
}