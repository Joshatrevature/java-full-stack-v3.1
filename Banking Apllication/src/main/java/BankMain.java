

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;



public class BankMain {
    private static Scanner sc = new Scanner(System.in);
    private static User u = null;
    final static DataBaseAccessImpl dao = DataBaseAccessImpl.getInstance();


    public static void main(String[] args) throws Exception {


        // Initial input loop

        loop: while (true) {
            System.out.println("Menu:");
            System.out.println("1 to log into an account");
            System.out.println("2 to create a customer account");
            System.out.println("3 to create an admin account");
            System.out.println("0 to exit system");
            System.out.println("Enter option: ");
            int option = sc.nextInt();
            sc.nextLine();


            switch (option) {

                case 1:
                    login();
                    break;

                case 2:
                    createCustomer();
                    break;

                case 3:
                    createAdmin();
                    break;

                case 0:
                    break loop;
            }

            if (u != null) {
                loggedIn();
            }
        }

        sc.close();

    }

    public static void loggedIn() {
        if (!u.approved) {
            System.out.println(u.name + " aren't approved\n");
            u = null;
            return;
        }

        while (true) {
            System.out.println("menu:");
            System.out.println("1 to deposit");
            System.out.println("2 to withdraw");
            if (u.admin) {
                System.out.println("3 to approve users");
            }
            System.out.println("0 to log out of: " + u.name);
            System.out.println("Enter option: ");

            int option = sc.nextInt();
            sc.nextLine();
            if (!u.admin && option > 2) {
                System.out.println("Invalid option for a customer. Retry...");
                continue;
            }
            switch (option) {
                // log out
                case 0:
                    System.out.println(u.name + " logging out...");
                    u = null;
                    return;
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    approveUsers();

            }
        }
    }

    public static void login() throws IOException {
        System.out.println("Log in...");

        boolean authenticated = false;
        while (!authenticated) {
            System.out.println("Enter your user name: ");
            String name = sc.nextLine();
            u = dao.getUser(name);
            if (u == null) {
                System.out.println("Invalid user name: " + name);
                continue;
            }

            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            if (!u.password.equals(password)) {
                System.out.println("Invalid password for : " + name);
            } else
                authenticated = true;
        }
        // Runtime.getRuntime().exec("clear");
        System.out.println("Welcome " + u.name);

        loggedIn();
    }

    public static void createCustomer() {
        System.out.println("Create a customer account");
        createUser(false);
        System.out.println("Customer account created, username: " + u.name);
    }

    public static void createAdmin() {
        System.out.println("Create an admin account");
        createUser(true);
        System.out.println("Admin account created, username: " + u.name);
    }

    public static void createUser(boolean admin) {
        String name = null;
        while (true) {
            System.out.println("Enter a new user name: ");
            name = sc.nextLine();
            if (dao.getUser(name) == null)
                break;
            System.out.println("User name already exists!");
        }
        System.out.println("Enter a password: ");
        String password = sc.nextLine();

        u = new User(name, password, 0, admin, false); // logs in
        boolean inserted = dao.insertUser(u);
    }

    private static void approveUsers() {
        System.out.println("Approve users");

        Map<String, User> m = dao.getAllUsers();
        if (m.isEmpty()) {
            System.out.println("No users in the system.");
            return;
        }
        System.out.println("Users in the system:");
        for (String k : m.keySet()) {
            User t = m.get(k);
            System.out.println(k + " " + t.approved);
        }

        System.out.println("Enter the name of the user to approve: ");
        String name = sc.nextLine();
        User enteredUser = m.get(name);
        enteredUser.approved = true;
        dao.updateUser(enteredUser);
        System.out.println(enteredUser.name + " approved.");
    }

    public static void deposit() {
        System.out.println(u.name + " your current balance is : $" + u.balance);
        System.out.println("Enter the amount to deposit: ");
        System.out.print("$");
        float deposit = sc.nextFloat();
        u.deposit(deposit);

        System.out.println(u.name + " your new balance is : $" + u.balance);
    }

    public static void withdraw() {
        System.out.println(u.name + " your current balance is : $" + u.balance);
        System.out.println("Enter the amount to withdraw: ");
        System.out.print("$");
        float withdrawal = sc.nextFloat();
        u.withdraw(withdrawal);

        System.out.println(u.name + " your new balance is : $" + u.balance);
    }

    // @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }
}

