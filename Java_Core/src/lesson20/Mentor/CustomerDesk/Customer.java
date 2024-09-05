package lesson20.Mentor.CustomerDesk;

public class Customer {
    private final String name;
    private final boolean isSending;

    public Customer(String name, boolean isSending) {
        this.name = name;
        this.isSending = isSending;
    }

    public String getName() {
        return name;
    }

    public boolean isSending() {
        return isSending;
    }
}
