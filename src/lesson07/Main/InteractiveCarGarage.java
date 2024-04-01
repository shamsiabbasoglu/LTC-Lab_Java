package lesson07.Main;

import java.util.Scanner;

public class InteractiveCarGarage {
    public static void main(String[] args) {
        int parkingSpaces = 5;
        int carAttribute = 3;

        //garage array
        String[][] garage = new String[parkingSpaces][carAttribute];

        //make garage empty
        for (int i = 0; i < parkingSpaces; i++) {
            for (int j = 0; j < carAttribute; j++) {
                garage[i][j] = "Empty";
            }
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Car Garage Menu:");
            System.out.println("1. Park a car");
            System.out.println("2. Display garage");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            //Menu interaction
            switch (choice) {
                case 1:
                    boolean garageFull = true;

                    //check if garage is full
                    for (String[] string : garage) {
                        if (string[0].equals("Empty")) {
                            garageFull = false;
                            break;
                        }
                    }

                    //warn user if garage is full
                    if (garageFull) {
                        System.out.println("Warning: The garage is full. Cannot park more cars.");
                        break;
                    }

                    //park initialize
                    System.out.print("Enter parking space number (1-" + garage.length + "): ");
                    int parkingSpace = scanner.nextInt();

                    if (parkingSpace < 1 || parkingSpace > garage.length) {
                        System.out.println("Invalid parking space number. Please enter a valid parking space.");
                        break;
                    }

                    //check if park space occupied
                    while (!garage[parkingSpace - 1][0].equals("Empty")) {
                        System.out.println("Parking space " + parkingSpace + " is already occupied. Choose a different space.");
                        System.out.print("Enter parking space number (1-" + garage.length + "): ");
                        parkingSpace = scanner.nextInt();
                    }

                    //ask car attributes
                    System.out.print("Enter car brand: ");
                    String brand = scanner.next();
                    System.out.print("Enter car model: ");
                    String model = scanner.next();
                    System.out.print("Enter car year: ");
                    String year = scanner.next();

                    garage[parkingSpace - 1][0] = brand;
                    garage[parkingSpace - 1][1] = model;
                    garage[parkingSpace - 1][2] = year;

                    System.out.println("Car parked successfully in parking space " + parkingSpace + ".");
                    break;

                case 2:
                    System.out.println("Current state of the car garage:");

                    for (int i = 0; i < garage.length; i++) {
                        System.out.print("Parking space " + (i + 1) + ": ");
                        for (int j = 0; j < garage[i].length; j++) {
                            System.out.print(garage[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the car garage App. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
    }
}