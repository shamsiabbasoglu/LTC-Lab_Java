package lesson12.Mentor;

import java.util.Objects;

public class Contact {
    private String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("John", "+994509876543");
        Contact contact2 = new Contact("John", "+994559876543");
        Contact contact3 = new Contact("Jack", "+994509876543");
        Contact contact4 = new Contact("John", "+994509876543");

        System.out.println(contact1.equals(contact2));
        System.out.println(contact2.equals(contact3));
        System.out.println(contact1.equals(contact4));
    }
}