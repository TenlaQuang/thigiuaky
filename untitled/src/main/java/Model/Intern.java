package Model;

public class Intern extends Employee{
    public String Majors;
    public String Semeter;
    public String University_name;
    public Intern(String ID, String Name, String Birthday, int Phone, String Email, String Employeetype, String Majors, String Semeter, String University_name) {
        super(ID, Name, Birthday, Phone, Email, Employeetype);
        this.Majors = Majors;
        this.Semeter = Semeter;
        this.University_name = University_name;

    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemeter() {
        return Semeter;
    }

    public void setSemeter(String semeter) {
        Semeter = semeter;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("Majors: " + Majors);
        System.out.println("Semeter: " + Semeter);
        System.out.println("University name: " + University_name);
    }
}
