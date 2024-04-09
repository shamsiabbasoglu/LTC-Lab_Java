package lesson13.Mentor.Company;

class Worker {
    private final String name;
    private final String birthDate;
    private final String endOfContract;

    public Worker(String name, String birthDate, String endOfContract) {
        this.name = name;
        this.birthDate = birthDate;
        this.endOfContract = endOfContract;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndOfContract() {
        return endOfContract;
    }

    public void retire() {
        System.out.println(name + " has retired.");
    }
}