package Chapter3;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        double monthlySalary;
        double yearlySalary;
        double newYearlySalary;
        String firstName;
        String lastName;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter salary: ");
        monthlySalary= input.nextDouble();

        System.out.println("Enter FirstName: ");
        firstName = input.next();

        System.out.println("Enter LastName: ");
        lastName = input.next();


        Employee employee = new Employee(firstName,lastName, monthlySalary);

        System.out.printf("Mr %S %S monthly salary is %.2f%n", employee.getFirstName(), employee.getLastName(), employee.getMonthlySalary());

        System.out.printf("Mr %S %S yearly Salary is %.2f%n", employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());

        System.out.printf("Mr %S %S new yearly salary is %.2f", employee.getFirstName(), employee.getLastName(), (employee.getYearlySalary() + (employee.getYearlySalary() * 0.1)));





//
//        Employee employee2 = new Employee("janet","jones",40000.0);
//
//        System.out.printf("the yearly salary for employee1 is %.2f%n", employee1.getYearlySalary());
//        System.out.printf("the yearly salary for employee2 is %.2f%n", employee2.getYearlySalary());
//
//
//
//        System.out.printf("The newYearlySalary for employee1 is %.2f%n",(employee1.getYearlySalary() + (0.1 * employee1.getYearlySalary())) );
//        System.out.printf("The newYearlySalary for employee2 is %.2f%n",(employee1.getYearlySalary() + (0.1 * employee2.getYearlySalary())) );




//        System.out.println("Enter Employee2 Monthly Salary: ");
//        double employee2Salary = input.nextDouble();
//
//        System.out.println("Enter Employee2 Monthly Salary: ");
//        double employee2Salary = input.nextDouble();


//        System.out.printf("the  new yearly salary for employee2 is %.2f", employee2.getNewYearlySalary());

//        public double getNewYearlySalary(){
//            double yearlySalary;
//            double newYearlySalary;
//            newYearlySalary = yearlySalary + (0.1 * yearlySalary);
//            return newYearlySalary;



        }



}
