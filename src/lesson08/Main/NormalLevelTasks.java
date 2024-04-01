package lesson08.Main;
public class NormalLevelTasks {
    public static void main(String[] args) {
        //Task 1
        Car car = new Car();
        car.brand = "Ford";
        car.model = "Mustang";
        car.year = 1967;

        System.out.println(car.brand + " " + car.model + " " + car.year);

        //Task 2
        Convert convert = new Convert();
        double km = 28 * convert.mil;
        System.out.println(km); //28 miles in kilometers
        double cm = 35 * convert.inch;
        System.out.println(cm); //35 inch in centimeters
        String myCar = convert.brand + " " + convert.model;
        System.out.println("My car is: " + myCar); //displays string attributes came from Convert class

        //Task 3.1
        System.out.println(sum(5, 7));
        //Task 3.2
        System.out.println(repeat("BMW ", 3));
        //Task 3.3
        System.out.println(arrayAverage());
    }

    //Task 1
    public static class Car {
        String brand;
        String model;
        int year;
    }

    //Task 2
    public static class Convert {
        double mil = 1.609;
        double inch = 2.54;
        //string examples
        String brand = "Ford";
        String model = "Mustang";
    }

    //Task 3.1
    public static int sum(int a, int b) {
        return a + b;
    }
    //Task 3.2
    public static String repeat(String h, int a) {
        return h.repeat(a);
    }
    //Task 3.3
    public static double arrayAverage() {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100 + 1);
        }
        double sum = 0;
        for (double j : array) {
            sum += j;
        }
        return sum / array.length;
    }
}
