package Chapter3;

import java.util.Scanner;

public class HealthProfileMain {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String gender;
        double height;
        double weight;
        int day;
        int month;
        int year;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Name: ");
        firstName = input.nextLine();

        System.out.println("Enter Last Name: ");
        lastName = input.nextLine();

        System.out.println("Enter Gender: ");
        gender = input.nextLine();

        System.out.println("Enter Height: ");
        height = input.nextDouble();

        System.out.println("Enter Weight: ");
        weight = input.nextDouble();

        System.out.println("Enter Day: ");
        day = input.nextInt();

        System.out.println("Enter Month:");
        month = input.nextInt();

        System.out.println("Enter Year: ");
        year = input.nextInt();

        HealthProfile healthProfile = new HealthProfile(firstName, lastName,gender,height,weight,day,month,year);

        System.out.println("First Name: : "  + healthProfile.getFirstName());
        System.out.println("Last Name: "  + healthProfile.getLastName());
        System.out.println("Gender: "    + healthProfile.getGender());
        System.out.println("Date of Birth: " + healthProfile.dateOfBirth());
        System.out.println("Age in Years: " + healthProfile.calculateAge());
        System.out.println("BMI: " + healthProfile.calculateBodyMassIndex());
        if (healthProfile.calculateBodyMassIndex() < 18.5){
            System.out.printf("BMI is %.2f, you are Underweight" ,healthProfile.calculateBodyMassIndex() );
        }

        if(healthProfile.calculateBodyMassIndex() >=18.5 && healthProfile.calculateBodyMassIndex() <= 24.9){
            System.out.printf("BMI is %.2f, you are Normal%n", healthProfile.calculateBodyMassIndex());
        }

        if(healthProfile.calculateBodyMassIndex() >=25 && healthProfile.calculateBodyMassIndex() <=29.9){
            System.out.printf("BMI is %.2f, you are Overweight%n", healthProfile.calculateBodyMassIndex());
        }

        if(healthProfile.calculateBodyMassIndex() >= 30){
            System.out.printf("BMI is %.2f , you are Obese%n", healthProfile.calculateBodyMassIndex());
        }

        System.out.println("MaximumHeartRate: " + healthProfile.calculateMaximumHeartRate());
        System.out.println("Target-Heart-Range(Min - Max): " +  healthProfile.calculateMinimumTargetHeartRate() +  "-"  + healthProfile.calculateMaximumHeartRate());






    }
}
