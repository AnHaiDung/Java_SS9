package re.btvn.bai5;

import java.util.Scanner;

public class OfficeEmployee extends Employee {
    private String name;
    private int salary;
    private int dayWrok;

    public OfficeEmployee(String name, int salary, int dayWrok) {
        this.name = name;
        this.salary = salary;
        this.dayWrok = dayWrok;
    }

    public OfficeEmployee() {
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("OfficeEmployee: ");
        System.out.println("name: " +name);
        System.out.println("total salary: " + salary*dayWrok);
    }
}
