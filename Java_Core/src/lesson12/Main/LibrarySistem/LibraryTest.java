package lesson12.Main.LibrarySistem;

public class LibraryTest {
    public static void main(String[] args) {
        //created instance
        LibraryBook book = new LibraryBook("Sherlock Holmes", "Arthur Conan Doyle", 1887);

        //book details
        System.out.println(book);

        //Check out the book
        book.checkOut();
        System.out.println("Is the " + book.getTitle() + " available? " + book.isAvailable());

        //returned book
        book.returnBook();
        System.out.println("Is the " + book.getTitle() + " available now? " + book.isAvailable());
    }
}