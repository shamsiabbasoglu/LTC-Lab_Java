package lesson11.Main.ZooKeeper;

public class Animal {
    String name;
    String species;
    int age;
    static int totalVisitors = 0;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        totalVisitors++;
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public void makeSound() {
        System.out.println(name + ", the " + species + ", makes a sound!");
    }
}
