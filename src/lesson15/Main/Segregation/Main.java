package lesson15.Main.Segregation;

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Duck duck = new Duck();

        person.swim();
        person.walk();

        duck.fly();
        duck.swim();
        duck.walk();
    }
}
