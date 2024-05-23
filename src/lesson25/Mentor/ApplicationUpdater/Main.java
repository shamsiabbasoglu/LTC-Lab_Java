package lesson25.Mentor.ApplicationUpdater;

public class Main {
    public static void main(String[] args) {
        ApplicationUpdater updater = new ApplicationUpdater();
        updater.add(new Application("WhatsApp", 4.12));
        updater.add(new Application("WhatsApp", 4.11));
        updater.add(new Application("WhatsApp", 4.13));
        updater.add(new Application("WhatsApp", 4.13));
    }
}
