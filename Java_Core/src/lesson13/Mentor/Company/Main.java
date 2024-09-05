package lesson13.Mentor.Company;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Peter Jackson", "1970-03-02",
                "2023-12-31", "2020-05-15", 96000 );
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alice Thomson", "1975-11-05",
                "2023-06-30", "2019-09-20", 30);

        salariedEmployee.generateEmployeeReport();
        salariedEmployee.trackEmployeeTenure();
        System.out.println(salariedEmployee.getName() + "'s monthly salary: $" + salariedEmployee.getMonthlySalary());
        salariedEmployee.retirementCalculator();
        System.out.println();

        hourlyEmployee.generateEmployeeReport();
        hourlyEmployee.trackEmployeeTenure();
        System.out.println(hourlyEmployee.getName() + "'s monthly salary: $" + hourlyEmployee.getMonthlySalary());
        hourlyEmployee.retirementCalculator();
    }
}