package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double CleanSalary;
        if (salary <=10000 && salary >= 0) {
           CleanSalary = salary*0.85;
        } else if (salary<= 20000) {
           CleanSalary = salary*0.82;
        } else if (salary > 20000) {
            CleanSalary = salary*0.8;
        } else {
            System.out.println("wrong imput!");
        }
    }
}
