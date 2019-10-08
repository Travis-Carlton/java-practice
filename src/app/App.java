package app;

// import app.HelloWorld;
import app.Email;

// import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Email email1 = new Email("Travis", "Carlton");
        email1.setAltEmail("alt.email@dept.company.com");
        email1.setMailboxCapacity(10000);
        email1.getAltEmail();
        email1.getMailboxCapacity();
    }
}