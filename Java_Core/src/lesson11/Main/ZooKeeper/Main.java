package lesson11.Main.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Simba", "Lion", 5);
        Animal elephant = new Animal("Dumbo", "Elephant", 10);

        int total = Animal.getTotalVisitors();
        System.out.println("Total visitors: " + total);

        lion.makeSound();
        elephant.makeSound();


        Feeder feeder = new Feeder();

        feeder.prepareMeal("meat and vegetables");


        Trainer trainer = new Trainer();

        trainer.teachTrick(lion, "roar");
        trainer.teachTrick(elephant, "sit");
    }
}
