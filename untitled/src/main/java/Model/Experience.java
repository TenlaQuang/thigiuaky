package Model;

public class Experience extends Employee{
    public int ExpInYear;
    public String ProSkill;
    public Experience(String ID, String Name, String Birthday, int Phone, String Email, String Employeetype,int ExpInYear,String ProSkill) {
        super(ID,Name,Birthday,Phone,Email,Employeetype);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public void showInfor() {
        super.showInfor();
        System.out.println("Experience: " + ExpInYear);
        System.out.println("proskill: " + ProSkill);
    }
}
