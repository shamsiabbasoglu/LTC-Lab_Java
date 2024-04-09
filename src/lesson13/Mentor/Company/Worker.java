package lesson13.Mentor.Company;

import java.time.LocalDate;
import java.time.Period;

class Worker {
    private final String name;
    private final LocalDate birthDate;
    private final String endOfContract;

    public Worker(String name, String birthDate, String endOfContract) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.endOfContract = endOfContract;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEndOfContract() {
        return endOfContract;
    }

    public void retirementCalculator() {
        //Assume retirement age is 65
        int retirementAge = 65;
        LocalDate currentDate = LocalDate.now();
        LocalDate retirementDate = birthDate.plusYears(retirementAge);
        Period periodUntilRetirement = Period.between(currentDate, retirementDate);
        System.out.println("Remaining " + periodUntilRetirement.getYears() + " years, " +
                periodUntilRetirement.getMonths() + " months, " + periodUntilRetirement.getDays() + " days until " +
                "retirement for " + getName());
    }
}