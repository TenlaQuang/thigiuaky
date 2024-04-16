package Controller;

import Model.Employee;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFileIO {
    private String filePath;

    public EmployeeFileIO(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<Employee> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Employee employee : employees) {
                writer.println(employee.getClass().getSimpleName());
                writer.println(employee.getID());
                writer.println(employee.getName());
                writer.println(employee.getBirthday());
                writer.println(employee.getPhone());
                writer.println(employee.getEmail());
                writer.println(employee.getEmployeetype());

                if (employee instanceof Experience) {
                    Experience experience = (Experience) employee;
                    writer.println(experience.getExpInYear());
                    writer.println(experience.getProSkill());
                } else if (employee instanceof Fresher) {
                    Fresher fresher = (Fresher) employee;
                    writer.println(fresher.getGraduation_date());
                    writer.println(fresher.getGraduation_rank());
                    writer.println(fresher.getEducation());
                } else if (employee instanceof Intern) {
                    Intern intern = (Intern) employee;
                    writer.println(intern.getMajors());
                    writer.println(intern.getSemeter());
                    writer.println(intern.getUniversity_name());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> readFromFile() {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String className = line.trim();
                String id = reader.readLine();
                String fullName = reader.readLine();
                String birthDay = reader.readLine();
                int phone = Integer.parseInt(reader.readLine());
                String email = reader.readLine();
                String employeeType = reader.readLine();

                if (className.equals("Experience")) {
                    int expInYear = Integer.parseInt(reader.readLine());
                    String proSkill = reader.readLine();
                    employees.add(new Experience(id, fullName, birthDay, phone, email, employeeType, expInYear, proSkill));
                } else if (className.equals("Fresher")) {
                    String graduationDate = reader.readLine();
                    String graduationRank = reader.readLine();
                    String education = reader.readLine();
                    employees.add(new Fresher(id, fullName, birthDay, phone, email, employeeType, graduationDate, graduationRank, education));
                } else if (className.equals("Intern")) {
                    String majors = reader.readLine();
                    String semester = reader.readLine();
                    String universityName = reader.readLine();
                    employees.add(new Intern(id, fullName, birthDay, phone, email, employeeType, majors, semester, universityName));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}