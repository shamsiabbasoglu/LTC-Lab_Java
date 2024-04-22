package lesson16.Main.Registration;

import java.io.*;

public class Participant {
    private final String name;
    private final int age;
    private final String email;


    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void displayParticipants() {
        String FILE_NAME = "C:\\Users\\Shamsi\\Documents\\participants.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String email = parts[2];
                System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file participants.txt was not found.");
        } catch (IOException e) {
            System.err.println("Error reading participants file: " + e.getMessage());
        }
    }
}
