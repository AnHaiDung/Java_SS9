package re.btvn.bai3;

import java.util.Scanner;

public class Employee {
    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void display(){}

    public static void main(String[] args) {
        Employee employee = new Manager("Dung", 36.18F,"rikkei");
        employee.display();
    }
}
