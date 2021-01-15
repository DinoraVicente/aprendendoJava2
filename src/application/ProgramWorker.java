package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramWorker {
    public static void main(String [] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String nameDepartment = sc.nextLine();

        System.out.println();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();
        System.out.print("Level (JUNIOR, MID_LEVEL or SENIOR): ");
        String levelWorker = sc.nextLine();
        System.out.print("Base salary: ");
        double salaryWorker = sc.nextInt();

        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker), salaryWorker, new Department(nameDepartment));

        System.out.println();
        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for(int i=0; i< contracts; i++){
            System.out.println();
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.println();

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract hourContract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(month, year));

        sc.close();
    }
}
