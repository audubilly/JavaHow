package Chapter3;

import java.util.Scanner;

public class HeartRateDriver {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        int year;
        int day;
        int month;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstName= input.nextLine();

        System.out.println("Enter Last Name: ");
        lastName = input.nextLine();

        System.out.println("Enter day: ");
        day = input.nextInt();

        System.out.println("Enter month: ");
        month = input.nextInt();

        System.out.println("Enter year: ");
        year = input.nextInt();

        HeartRates heartRates = new HeartRates(firstName , lastName, day, month, year);


        System.out.println("First Name: " + heartRates.getFirstName());
        System.out.println("last Name: " + heartRates.getLastName());
        System.out.println("Age in Years: " + heartRates.calculateAge());
        System.out.println("dateOfBirth: " + heartRates.dateOfBirth());
        System.out.println("maximumHeartRate: " + heartRates.calculateMaximumHeartRate());
        System.out.println("TargetHeartRateRange(Min - Max): " + heartRates.calculateMinimumTargetHeartRate() + " - "+  heartRates.calculateMaximumHeartRate());
















    }
}
