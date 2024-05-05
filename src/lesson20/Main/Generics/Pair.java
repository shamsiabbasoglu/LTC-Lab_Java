package lesson20.Main.Generics;

public class Pair<T,E> {
    private T name;
    private E number;

    public Pair(T name, E number) {
        this.name = name;
        this.number = number;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getNumber() {
        return number;
    }

    public void setNumber(E number) {
        this.number = number;
    }
}
