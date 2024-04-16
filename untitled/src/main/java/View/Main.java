package View;

import Controller.EmployeeFileIO;
import Controller.EmployeeManager;
import Model.Employee;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static int employeeCount = 0;


    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!=4) {
            displayMenu();
            String filePath = "employees.txt";
            EmployeeFileIO fileIO = new EmployeeFileIO(filePath);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter employee type: \n");
                    System.out.println("1.Experience");
                    System.out.println("2.Fresher");
                    System.out.println("3.Intern");
                    int employeeType = scanner.nextInt();
                    scanner.nextLine();
                    switch (employeeType) {
                        case 1:System.out.print("Enter employee ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter employee name: ");
                            String name=scanner.nextLine();
                            System.out.print("Enter employee Birthday: ");
                            String birthday=scanner.nextLine();
                            System.out.print("Enter employee phone: ");
                            int phone=scanner.nextInt();
                            System.out.print("Enter employee email: ");
                            String Email=scanner.nextLine();
                            System.out.print("Enter employee type: ");
                            String Employtp=scanner.nextLine();
                            System.out.print("Enter employee Experience Year: ");
                            int ExpYear=scanner.nextInt();
                            System.out.print("Enter employee ProSkill: ");
                            String Pskill=scanner.nextLine();
                            scanner.nextLine();
                            Experience e = new Experience(id, name, birthday, phone, Email, Employtp, ExpYear, Pskill);
                            employeeCount++;
                            e.setEmployeeNumber(employeeCount);
                            employeeManager.addEmployee(e);
                            break;
                        case 2:System.out.print("Enter employee ID: ");
                            String id1 = scanner.nextLine();
                            System.out.print("Enter employee name: ");
                            String name1=scanner.nextLine();
                            System.out.print("Enter employee Birthday: ");
                            String birthday1=scanner.nextLine();
                            System.out.print("Enter employee phone: ");
                            int phone1=scanner.nextInt();
                            System.out.print("Enter employee email: ");
                            String Email1=scanner.nextLine();
                            System.out.print("Enter employee type: ");
                            String Employtp1=scanner.nextLine();
                            System.out.print("Enter employee Graduation_date: ");
                            String d=scanner.nextLine();
                            System.out.print("Enter employee Graduation_rank: ");
                            String r=scanner.nextLine();
                            System.out.print("Enter employee Education: ");
                            String Education=scanner.nextLine();

                            Fresher f = new Fresher(id1, name1, birthday1, phone1, Email1, Employtp1, d,r,Education);
                            employeeCount++;
                            f.setEmployeeNumber(employeeCount);
                            employeeManager.addEmployee(f);
                            break;
                        case 3:System.out.print("Enter employee ID: ");
                            String id2 = scanner.nextLine();
                            System.out.print("Enter employee name: ");
                            String name2=scanner.nextLine();
                            System.out.print("Enter employee Birthday: ");
                            String birthday2=scanner.nextLine();
                            System.out.print("Enter employee phone: ");
                            int phone2=scanner.nextInt();
                            System.out.print("Enter employee email: ");
                            String Email2=scanner.nextLine();
                            System.out.print("Enter employee type: ");
                            String Employtp2=scanner.nextLine();
                            System.out.print("Enter employee Majors: ");
                            String m=scanner.nextLine();
                            System.out.print("Enter employee Semeter: ");
                            String s=scanner.nextLine();
                            System.out.print("Enter employee University_name: ");
                            String u=scanner.nextLine();

                            Intern i = new Intern(id2, name2, birthday2, phone2, Email2, Employtp2, m,s,u);
                            employeeCount++;
                            i.setEmployeeNumber(employeeCount);
                            employeeManager.addEmployee(i);
                            break;
                    }
                    break;
                case 2:employeeManager.displayEmployees();
                break;
                case 3:
                    System.out.print("Enter Employee number: ");
                    int number=scanner.nextInt();
                    scanner.nextLine();
                    Employee employeeToUpdate = findEmployeeByNumber(number);

                    if (employeeToUpdate == null) {
                        System.out.println("Employee not found.");
                        return;
                    }
                    System.out.print("Enter employee ID: ");
                    String id1 = scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    String name1=scanner.nextLine();
                    System.out.print("Enter employee Birthday: ");
                    String birthday1=scanner.nextLine();
                    System.out.print("Enter employee phone: ");
                    int phone1=scanner.nextInt();
                    System.out.print("Enter employee email: ");
                    String Email1=scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter employee type: ");
                    String Employtp1=scanner.nextLine();
                    scanner.nextLine();


                    break;
                case 4:
                    System.out.print("Enter employee number to delete: ");
                    int number2=scanner.nextInt();
                        Employee employeeTodelete = findEmployeeByNumber(number2);
                        if (employeeTodelete == null) {
                            System.out.println("Employee not found.");
                            return;
                        }
                        employeeList.remove(employeeTodelete);
                        break;
                case 5:
                    fileIO.writeToFile(employeeList);
                    System.out.println("saved");
                    break;
                case 6:
                    List<Employee> employeesFromFile = fileIO.readFromFile();
                    System.out.println("Employees read from file:");
                    for (Employee employee : employeesFromFile) {
                        employee.showInfor();
                        System.out.println();
                    }
                    break;
            }
        }
    }
    private static void displayMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Add employee");
        System.out.println("2. Display employee");
        System.out.println("3. Update employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Save to file");
        System.out.println("6. Load from file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    private static Employee findEmployeeByNumber(int employeeNumber) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeNumber() == employeeNumber) {
                return employee;
            }
        }
        return null;
    }

}
