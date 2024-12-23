package Electricity_bill_calculator;
import java.util.*;
class User {
    String username;
    String password; // Encrypted password
    String role;     // "Admin" or "Manager"

    User(String username, String password, String role) {
        this.username = username;
        this.password = encryptPassword(password);
        this.role = role;
    }

    private String encryptPassword(String password) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : password.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                encrypted.append((char) ((ch - 'a' + 1) % 26 + 'a'));
            } else if (ch >= 'A' && ch <= 'Z') {
                encrypted.append((char) ((ch - 'A' + 1) % 26 + 'A'));
            } else if (ch >= '0' && ch <= '9') {
                encrypted.append((char) ((ch - '0' + 1) % 10 + '0'));
            } else {
                encrypted.append(ch); // Non-alphabetic characters unchanged
            }
        }
        return encrypted.toString();
    }

    public boolean validatePassword(String password) {
        return this.password.equals(encryptPassword(password));
    }
}

public class ProductApplication {
    private static HashMap<String, User> users = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        // Default admin account
        users.put("admin", new User("admin", "admin", "Admin"));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Online Product Application!");

        while (true) {
            System.out.println("\n1. Login\n2. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            if (choice == 1) {
                login();
            } else if (choice == 2) {
                System.out.println("Exiting... Goodbye!");
                break;
            }
        }
    }

    private static void login() {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (users.containsKey(username) && users.get(username).validatePassword(password)) {
            User currentUser = users.get(username);
            System.out.println("Login Successful! Welcome, " + currentUser.role + ": " + currentUser.username);

            if (currentUser.role.equals("Admin")) {
                adminMenu();
            } else if (currentUser.role.equals("Manager")) {
                managerMenu();
            }
        } else {
            System.out.println("Invalid Credentials. Please try again.");
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Create Manager");
            System.out.println("2. Delete Manager");
            System.out.println("3. Change Manager Password");
            System.out.println("4. Logout");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createManager();
                    break;
                case 2:
                    deleteManager();
                    break;
                case 3:
                    changeManagerPassword();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void managerMenu() {
        while (true) {
            System.out.println("\nManager Menu:");
            System.out.println("1. Change Your Password");
            System.out.println("2. Logout");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void createManager() {
        System.out.print("Enter New Manager Username: ");
        String username = sc.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try a different one.");
            return;
        }

        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        users.put(username, new User(username, password, "Manager"));
        System.out.println("Manager account created successfully.");
    }

    private static void deleteManager() {
        System.out.print("Enter Manager Username to Delete: ");
        String username = sc.nextLine();
        if (users.containsKey(username) && users.get(username).role.equals("Manager")) {
            users.remove(username);
            System.out.println("Manager account deleted successfully.");
        } else {
            System.out.println("Manager not found.");
        }
    }

    private static void changeManagerPassword() {
        System.out.print("Enter Manager Username: ");
        String username = sc.nextLine();
        if (users.containsKey(username) && users.get(username).role.equals("Manager")) {
            System.out.print("Enter New Password: ");
            String newPassword = sc.nextLine();
            users.get(username).password = new User(username, newPassword, "Manager").password;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Manager not found.");
        }
    }

    private static void changePassword() {
        System.out.print("Enter Your Username: ");
        String username = sc.nextLine();
        if (users.containsKey(username)) {
            System.out.print("Enter New Password: ");
            String newPassword = sc.nextLine();
            users.get(username).password = new User(username, newPassword, users.get(username).role).password;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}