package lesson13.Mentor.Company;

class SalariedEmployee extends Employee {
    private final double annualSalary;

    public SalariedEmployee(String name, String birthDate, String endOfContract, String hireDate, double annualSalary) {
        super(name, birthDate, endOfContract, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getMonthlySalary() {
        return annualSalary / 12;
    }
}