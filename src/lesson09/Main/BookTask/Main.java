package lesson09.Main.BookTask;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo Tolstoy", 1828);
        Author author2 = new Author("Albert Camus", 1913);
        Author author3 = new Author("Abu Hamid Al-Ghazali", 1058);

        Book book1 = new Book("What Men Live By", author1, 1885);
        Book book2 = new Book("The Myth of Sisyphus", author2, 1942);
        Book book3 = new Book("The Alchemy of Happiness", author3, 1105);

        System.out.println(author1 + "\n" + book1 + "\n" + author2 + "\n" + book2 + "\n" + author3 + "\n" + book3);

    }
}
