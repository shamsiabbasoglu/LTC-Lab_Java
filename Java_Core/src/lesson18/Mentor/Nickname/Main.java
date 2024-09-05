package lesson18.Mentor.Nickname;

public class Main {
    public static void main(String[] args) {
        NicknameGenerator nicknameGenerator = new NicknameGenerator("Shamsi", "Abbasov", 1989);
        System.out.println(nicknameGenerator.generateNickName());
    }
}
