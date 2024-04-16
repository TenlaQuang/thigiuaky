package Model;

public class Employee implements IEmployee{
    public String ID;
    public String Name;
    public String Birthday;
    public int Phone;
    public String Email;
    public String Employeetype;
    public int employeeNumber;
    public Employee(String ID, String Name, String Birthday, int Phone, String Email, String Employeetype) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Phone = Phone;
        this.Email = Email;
        this.Employeetype = Employeetype;

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmployeetype() {
        return Employeetype;
    }

    public void setEmployeetype(String employeetype) {
        Employeetype = employeetype;
    }

    @Override
    public void showInfor() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Birthday: " + Birthday);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employeetype: " + Employeetype);
    }
}
