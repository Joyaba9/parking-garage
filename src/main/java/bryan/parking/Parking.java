/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.parking;

/**
 *
 * @author EL GUARDIAN
 */


 import java.util.Scanner;

public class Parking {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minimumFee = 2.0;
        double hourlyRate = 0.5;
        double maxCharge = 10.0;
        double totalAmount = 0.0;

        System.out.print("Enter number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter hours parked for customer " + i + " : ");
            int hours = scanner.nextInt();

            double charge = calculateCharges(hours, minimumFee, hourlyRate, maxCharge);
            System.out.printf("Parking charge for customer %d: $%.2f%n", i, charge);

            totalAmount += charge;
        }

        System.out.printf("Total amount of all transactions: $%.2f%n", totalAmount);
    }

    public static double calculateCharges(int hours, double minimumFee, double hourlyRate, double maxCharge) {
        double charge = minimumFee;

        if (hours > 3) {
            charge += (hours - 3) * hourlyRate;
        }

        if (charge > maxCharge) {
            charge = maxCharge;
        }

        return charge;
    }
}