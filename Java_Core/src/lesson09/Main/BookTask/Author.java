package lesson09.Main.BookTask;

public class Author {
    String name;
    int birthYear;

    public String getName() {
        return name;
    }

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + " (Birth year: " + birthYear + ")";
    }
}
