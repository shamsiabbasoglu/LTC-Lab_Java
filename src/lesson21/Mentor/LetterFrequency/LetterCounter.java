package lesson21.Mentor.LetterFrequency;

import java.util.*;

public class LetterCounter {
    private String word;
    private char[] characters;
    private Map<Character, Integer> map;

    public LetterCounter(String word) {
        this.word = word;
        this.map = new TreeMap<>();
        this.characters = this.word.toLowerCase().toCharArray();
        addToMap();
    }

    public void addToMap() {
        for (Character character: characters) {
            if (Character.isAlphabetic(character)) {
                map.put(character, map.getOrDefault(character, 0) + 1);
            }
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
