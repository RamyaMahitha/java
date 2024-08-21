import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private int defaultPasswordLength = 8;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Ask for department
    private String setDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Department code: \nEnter department \n1) Sales \n2) Development \n3) Accounting \n4) None \nEnter department code: ");
        int depChoice = input.nextInt();
        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "";
        }
    }

    // Generate random password
    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%_-";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand); // Use 'charAt' method correctly
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY_NAME: " + firstname + " " + lastname + "\nCOMPANY_EMAIL: " + email + "\nMAILBOX_CAPACITY: " + mailboxCapacity + "mb";
    }
}
