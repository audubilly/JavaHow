package Chapter3;

import java.util.Scanner;

public class DateClassTest {

    public static void main(String[] args) {

        int month;
        int day;
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Month: ");
        month = input.nextInt();

        System.out.println("Enter Day: ");
        day = input.nextInt();

        System.out.println("Enter Year");
        year = input.nextInt();

        System.out.printf("%d / %d/ %d" , month, day, year);
















    }














}
