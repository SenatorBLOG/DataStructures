package assignment2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDepartmentDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mike", 1);
        Employee e2 = new Employee("Xing", 2);
        Employee e3 = new Employee("Bobby", 3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Department dept = new Department("Engineering", employeeList);

        System.out.println(dept);
    }
}