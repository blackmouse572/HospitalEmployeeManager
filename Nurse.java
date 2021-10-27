package employee;

import java.util.Scanner;

public class Nurse extends Employee {
    
    private String department;
    private int overtimeHours;
    
    // return total salary of nurse
    @Override
    double calSalary() {
        double nurseSalary = (coeffSalary * 1650000) + overtimeHours * 200000;
        return nurseSalary;
    }
    
    // coeffSalary is float, not int
    public Nurse( int id, String name, int phone, String email, 
                int coeffSalary, String department, int overtimeHours ) {
        super.id = id;
        super.name = name;
        super.phone = phone;
        super.email = email;
        super.coeffSalary = coeffSalary;
        this.department = department;
        this.overtimeHours = overtimeHours;
    }
    
    public Nurse() {
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
    
    public String getDepartment() {
        return this.department;
    }
    
    public int getOvertimeHours() {
        return this.overtimeHours;
    }
    
    // input method
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input department: ");
        this.department = sc.next();
        
        System.out.println("Input overtime hours: ");
        this.overtimeHours = sc.nextInt();
    }
    
    // print
    public void print() {
        super.print();
        System.out.println( "Department is: " + this.department );
        System.out.println( "Overtime hours: " + this.overtimeHours );
        System.out.println( "Total salary: " + calSalary() );
    }
}
