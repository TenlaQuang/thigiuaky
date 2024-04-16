package Model;

public class Fresher extends Employee{
    public String Graduation_date;
    public String Graduation_rank;
    public String Education;
    public Fresher(String ID, String Name, String Birthday, int Phone, String Email, String Employeetype, String Graduation_date, String Graduation_rank, String Education) {
        super(ID,Name,Birthday,Phone,Email,Employeetype);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("Graduation date : " + Graduation_date);
        System.out.println("Graduation rank : " + Graduation_rank);
        System.out.println("Education : " + Education);
    }
}
