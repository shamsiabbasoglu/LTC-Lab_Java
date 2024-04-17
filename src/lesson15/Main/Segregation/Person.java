package lesson15.Main.Segregation;

class Person implements Walk, Swim{
    @Override
    public void swim() {
        System.out.println("Person is swimming...");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking...");
    }
}
