package Employee;

import java.util.Scanner;

public class Doctor extends Employee {
    
    private String major
    private int level;
    private int positionAllowance;
    
   
    @Override
    public double calSalary() {
        return super.getCoefficient() * 1650000 + positionAllowance * 200000 + level;
    }
    
    public Doctor(String id, String name, String type, String phone, String email, double coefficient, String major, int level, int positionAllowance ) {
        super(id,name,type,phone,email,coefficient);
        this.major = major;
        this.level = level;
        this.positionAllowance = positionAllowance;
    }
    
    public Doctor() {
        super();
    }
    
    public String getmajor() {
        return major;
    }
    
    public int getlevel() {
        return level;
    }

    public int getpositionAllowance() {
        return positionAllowance;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.printf("%-10s",this.level);
        System.out.printf("%-4d",this.major);
        System.out.printf("%-4d",this.positionAllowance);
    }
}
