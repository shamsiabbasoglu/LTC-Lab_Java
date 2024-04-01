package lesson07.Main;

public class CarInventory {
    public static void main(String[] args) {

        //Define the amount of parking spaces and car attributes
        int num1 = 5; //amount of parking spaces
        int num2 = 3; //attributes; brand, model, year

        //2D array
        String[][] garage = new String[num1][num2];

        //garage data
        garage[0][0] = "Chevrolet";
        garage[0][1] = "Corvette";
        garage[0][2] = "1968";

        garage[1][0] = "Ford";
        garage[1][1] = "Mustang";
        garage[1][2] = "1967";

        garage[2][0] = "Porsche";
        garage[2][1] = "911";
        garage[2][2] = "1969";

        garage[3][0] = "Ferrari";
        garage[3][1] = "Dino 246 GT";
        garage[3][2] = "1972";

        garage[4][0] = "Jaguar";
        garage[4][1] = "E-Type";
        garage[4][2] = "1964";

        //print garage
        System.out.println("Virtual Car Garage:");
        for (int i = 0; i < num1; i++) {
            System.out.print("Parking Space " + (i + 1) + ": ");
            for (int j = 0; j < num2; j++) {
                System.out.print(garage[i][j] + " ");
            }
            System.out.println();
        }
    }
}
