package lesson21.Main.PhoneDirectory;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.addContact("Vodafone", "+90 542 542 00 00");
        phoneDirectory.addContact("Bakcell", "555");
        phoneDirectory.addContact("Asan Xidmət", "108");
        phoneDirectory.addContact("FHN", "112");

        System.out.println("Initial list: ");
        System.out.println(phoneDirectory);

        System.out.print("The value of 'Bakcell' is: ");
        phoneDirectory.searchContact("Bakcell");

        phoneDirectory.deleteContact("FHN");

        System.out.println("Updated list: ");
        System.out.println(phoneDirectory);
    }
}
