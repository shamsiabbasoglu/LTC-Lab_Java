package lesson13.Mentor.Company;

import java.time.LocalDate;

class Employee extends Worker {
    private final long employeeId;
    private final String hireDate;

    public Employee(String name, String birthDate, String endOfContract, String hireDate) {
        super(name, birthDate, endOfContract);
        this.employeeId = generateId();
        this.hireDate = hireDate;
    }

    public int generateId() {
        return (int) (Math.random() * 999 + 1);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void generateEmployeeReport() {
        System.out.println("Employee Report:");
        System.out.println("Name: " + getName());
        System.out.println("EmployeeId: " + getEmployeeId());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Hire Date: " + getHireDate());
        System.out.println("End of Contract: " + getEndOfContract());
    }

    public void trackEmployeeTenure() {
        LocalDate hireDate = LocalDate.parse(getHireDate());
        LocalDate currentDate = LocalDate.now();
        long yearsOfService = hireDate.until(currentDate).getYears();
        System.out.println(getName() + " has been with the company for " + yearsOfService + " years.");
    }
}