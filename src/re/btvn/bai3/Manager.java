package re.btvn.bai3;

import java.util.Scanner;

public class Manager extends Employee {
    private String departments;

    public Manager(String name, float salary, String departments) {
        super(name, salary);
        this.departments = departments;
    }

    public Manager() {
    }

    @Override
    public void display() {
        super.display();
        System.out.println("name: " + getName());
        System.out.println("salary: "+ getSalary());
        System.out.println("departments: "+departments);
    }
}
