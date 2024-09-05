package lesson21.Main.PhoneDirectory;

import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, String> phoneMap;

    public PhoneDirectory() {
        this.phoneMap = new LinkedHashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        phoneMap.put(name, phoneNumber);
    }

    public void searchContact(String name) {
        System.out.println(phoneMap.get(name));
    }

    public void deleteContact(String name) {
        phoneMap.remove(name);
    }

    @Override
    public String toString() {
        return phoneMap.toString();
    }
}
