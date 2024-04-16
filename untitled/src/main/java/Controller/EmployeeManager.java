package Controller;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private List<Employee> employees;
    public EmployeeManager() {
        employees = new ArrayList<Employee>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added");
    }
    public void displayEmployees() {
        if(employees.isEmpty()) {
            System.out.println("There are no employees");
            return;
        }
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.showInfor();
            System.out.println("--------");
        }
    }
    public void updateEmployee(Employee employee) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).equals(employee)) {
                Employee updatedEmployee = employees.get(i);
                System.out.println("Employee updated");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    public void deleteEmployee(Employee employee) {
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).equals(employee)) {
                employees.remove(i);
                System.out.println("Employee removed");
                return;
            }
        }
        System.out.println("Employee not found");
    }

}
