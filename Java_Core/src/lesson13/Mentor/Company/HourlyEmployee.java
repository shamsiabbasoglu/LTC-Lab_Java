package lesson13.Mentor.Company;

class HourlyEmployee extends Employee {
    private final double hourlySalary;

    public HourlyEmployee(String name, String birthDate, String endOfContract, String hireDate,
                          double hourlySalary) {
        super(name, birthDate, endOfContract, hireDate);
        this.hourlySalary = hourlySalary;
    }

    public double getMonthlySalary() {
        return hourlySalary * 8 * 30;
    }
}