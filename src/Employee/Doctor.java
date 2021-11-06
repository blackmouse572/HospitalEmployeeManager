package Employee;


public class Doctor extends Employee {
    
    private String major;
    private int level;
    private int positionAllowance;
    
    @Override
    double calSalary() {
         return  (super.getCoefficient() + this.level) * 1650000 + positionAllowance;
    }
    
    public Doctor( String id, String name,String phone, String email, float coefficient, String major, int level, int positionAllowance ) {
       super(id, name, 1, phone, email, coefficient);
        this.major = major;
        this.level= level;
        this.positionAllowance = positionAllowance;

    }

    public String getId(){return super.getId();}

    public String getName() {
        return super.getName();
    }

    public String getPhone() {
        return super.getPhone();
    }

    public String getEmail() {
        return super.getEmail();
    }

    public float getCoefficient() {
        return super.getCoefficient();
    }
    
    public String getMajor() {
        return this.major;
    }
    
    public int getLevel() {
        return this.level;
    }
    public int getPositionAllowance() {
        return this.positionAllowance;
    }
    

    // print
    public void display() {
        super.display();
        System.out.printf("%-11s%-6d%-12d%-10f\n",this.major,this.level,this.positionAllowance,calSalary());
    }
}
