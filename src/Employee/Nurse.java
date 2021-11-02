package Employee;

import java.util.Scanner;

public class Nurse extends Employee {
    
    private String department;
    private int overtimeHours;
    
    // return total salary of nurse
    @Override
    double calSalary() {
        double nurseSalary = (coefficient * 1650000) + overtimeHours * 200000;
        return nurseSalary;
    }
    
    // coeffSalary is float, not int
    public Nurse( String id, String name, String phone, String email, 
                int coefficient, String department, int overtimeHours ) {
        super.id = id;
        super.name = name;
        super.phone = phone;
        super.email = email;
        super.coefficient = coefficient;
        this.department = department;
        this.overtimeHours = overtimeHours;
    }
    
    public Nurse() {
        super();
    }
    
    public String getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public double getCoeffSalary() {
        return super.coefficient;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public int getOvertimeHours() {
        return this.overtimeHours;
    }
    
    // input method
    public void input() {
//        super.input();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input department: ");
        this.department = sc.next();
        
        System.out.println("Input overtime hours: ");
        this.overtimeHours = sc.nextInt();
    }
    
    // print
    public void display() {
        super.display();
        System.out.println( "Department is: " + this.department );
        System.out.println( "Overtime hours: " + this.overtimeHours );
        System.out.println( "Total salary: " + calSalary() );
    }
}
