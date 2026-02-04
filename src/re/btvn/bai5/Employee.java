package re.btvn.bai5;

import java.util.Scanner;

public class Employee {

    public void calculateSalary(){}



    public static void main(String[] args) {
        Employee[] arr = new Employee[2];
        arr[0] = new OfficeEmployee("Dung",36000000,2);
        arr[1] = new ProductionEmployee("Hoan",1800000,11);

        arr[0].calculateSalary();
        arr[1].calculateSalary();
    }
}
