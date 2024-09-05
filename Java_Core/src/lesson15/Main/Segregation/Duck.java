package lesson15.Main.Segregation;

class Duck implements Fly, Swim, Walk {

    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking...");
    }
}
