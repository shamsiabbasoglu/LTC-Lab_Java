package lesson18.Mentor.Nickname;

public class NicknameGenerator {
    private final String name;
    private final String surname;
    private final int birthYear;

    public NicknameGenerator(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String generateNickName() {
        StringBuilder nickBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i += 2) {
            nickBuilder.append(Character.toLowerCase(name.charAt(i)));
        }
        nickBuilder.append(surname.substring(0, Math.max(2, surname.length())).toLowerCase());
        nickBuilder.append(birthYear % 100);
        return nickBuilder.toString();
    }
}
