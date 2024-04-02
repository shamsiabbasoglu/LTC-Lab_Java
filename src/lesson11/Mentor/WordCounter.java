package lesson11.Mentor;

public class WordCounter {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has " +
                "been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but " +
                "also the leap into electronic typesetting, remaining essentially unchanged.";
        int wordCount = numberOfWords(string);
        System.out.println("Number of words: " + wordCount);
    }

    public static int numberOfWords(String text) {
        String trim = text.trim();

        String[] words = trim.split("\\s+");
        return words.length;
    }
}