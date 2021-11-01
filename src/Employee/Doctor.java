package Employee;

import java.util.Scanner;

public class Doctor extends Employee {
    
    private String major;
    private int level;
    private int positionAllowance;
    
    @Override
    double salaryCal() {
        double doctorSalary = (coeffSalary * 1650000) + positionAllowance * 200000;
        return doctorSalary;
    }
    
    public Doctor( int id, String name, int phone, String email, 
                int coeffSalary, String major, int positionAllowance ) {
        super.id = id;
        super.name = name;
        super.phone = phone;
        super.email = email;
        super.coeffSalary = coeffSalary;
        this.major = major;
        this.positionAllowance = positionAllowance;

    }
    
    public Doctor() {
        super();
    }
    
    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getCoeffSalary() {
        return super.coeffSalary;
    }
    
    public String major() {
        return this.major;
    }
    
    public int level() {
        return this.level;
    }
    public int positionAllowance() {
        return this.positionAllowance;
    }
    
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input major: ");
        this.major = sc.next();
        
        System.out.println("Input level: ");
        this.level = sc.nextInt();
              
        System.out.println("Enter Position Allowance: ");
        this.positionAllowance = sc.nextInt();

    }
    
    // print
    public void print() {
        super.print();
        System.out.println( "Major : " + this.major );
        System.out.println( "Position Allowance: " + this.positionAllowance );
        System.out.println( "Level: " + this.level );
        System.out.println( "Total salary: " + salaryCal() );
    }
}