package ru.panina.neoflexTask.CalculationVacationPay.Calculation;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculation {
    private double averageSalary;
    private double vacationDaysNumber;

    public Calculation(double averageSalary, double vacationDaysNumber) {
        this.averageSalary = averageSalary;
        this.vacationDaysNumber = vacationDaysNumber;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public double getVacationDaysNumber() {
        return vacationDaysNumber;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public void setVacationDaysNumber(double vacationDaysNumber) {
        this.vacationDaysNumber = vacationDaysNumber;
    }

    @Override
    public String toString() {
        return "Your data:{" +
                "averageSalary=" + averageSalary +
                ", vacationDaysNumber=" + vacationDaysNumber +
                '}';
    }
}
