package Electricity_bill_calculator;

import java.util.*;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter previous month's meter reading (in kWh): ");
        double prevReading = scanner.nextDouble();

        System.out.print("Enter date of last reading (dd/mm/yyyy): ");
        String lastReadingDate = scanner.next();

        boolean exit = false;
        double currReading = 0.0;
        double unitsConsumed = 0.0;
        double billAmount = 0.0;

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter current month's meter reading");
            System.out.println("2. Display amount to pay");
            System.out.println("3. Display date of last reading");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter current month's meter reading (in kWh): ");
                    currReading = scanner.nextDouble();
                    if (currReading <= prevReading) {
                        System.out.println("Error: Current reading must be greater than previous reading.");
                    } else {
                        unitsConsumed = currReading - prevReading;
                        billAmount = calculateBill(unitsConsumed);
                    }
                    break;
                case 2:
                    if (currReading <= prevReading) {
                        System.out.println("Please enter a valid current month's meter reading first.");
                    } else {
                        System.out.println("\n--- Electricity Bill ---");
                        System.out.println("Customer Name: " + customerName);
                        System.out.println("Previous Month Reading: " + prevReading + " kWh");
                        System.out.println("Current Month Reading: " + currReading + " kWh");
                        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
                        System.out.println("Bill Amount: ₹" + billAmount);
                        if (unitsConsumed <= 100) {
                            System.out.println("Since the units consumed are 100 or less, there is no payment required.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Date of last reading: " + lastReadingDate);
                    break;
                case 4:
                    System.out.println("Thank You !! Have a nice day");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }

    private static double calculateBill(double unitsConsumed) {
        double rate1 = 3.5;
        double rate2 = 4.6;
        double rate3 = 6.6;

        double billAmount = 0.0;

        if (unitsConsumed <= 100) {
            billAmount = 0;
        } else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount = (unitsConsumed - 100) * rate1;
        } else if (unitsConsumed > 200 && unitsConsumed <= 500) {
            billAmount = 100 * rate1 + (unitsConsumed - 200) * rate2;
        } else {
            billAmount = 100 * rate1 + 300 * rate2 + (unitsConsumed - 500) * rate3;
        }

        return billAmount;
    }
}
