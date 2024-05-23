package lesson25.Mentor.ApplicationUpdater;

import java.util.LinkedHashMap;

public class ApplicationUpdater {
    private final LinkedHashMap<String, Double> apps;

    public ApplicationUpdater() {
        this.apps = new LinkedHashMap<>();
    }

    public void add(Application application) {
        if (!apps.containsKey(application.getName())) {
            this.apps.put(application.getName(), application.getVersion());
            System.out.println("New application is installed.");
        } else {
            update(application);
        }
    }

    public void update(Application application) {
        Double currentVersion = apps.getOrDefault(application.getName(), 0.0);
        if (currentVersion < application.getVersion()) {
            apps.put(application.getName(), application.getVersion());
            System.out.println("Application is successfully updated to the last version.");
        } else if (currentVersion == application.getVersion()) {
            System.out.println("Application is already updated.");
        } else {
            apps.put(application.getName(), application.getVersion());
            System.out.println("The older version of application is installed.");
        }
    }
}
