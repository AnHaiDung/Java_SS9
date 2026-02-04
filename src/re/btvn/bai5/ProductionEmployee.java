package re.btvn.bai5;

import java.util.Scanner;

public class ProductionEmployee extends Employee{
    private String name;
    private int salary;
    private int product;

    public ProductionEmployee() {
    }

    public ProductionEmployee(String name, int salary, int product) {
        this.name = name;
        this.salary = salary;
        this.product = product;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("OfficeEmployee: ");
        System.out.println("name: " +name);
        System.out.println("total salary: " + salary*product);
    }
}
