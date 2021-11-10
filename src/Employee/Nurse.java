package Employee;


public class Nurse extends Employee {
    
    private String department;
    private int overtimeHours;
    
    // return total salary of nurse
    @Override
    double calSalary() {
        return super.getCoefficient() * 1650000 + overtimeHours * 200000;

    }
    
    // coeffSalary is float, not int
    public Nurse( String id, String name, String phone, String email, float coefficient, String department, int overtimeHours ) {
        super(id, name, "2", phone, email, coefficient);
        this.department = department;
        this.overtimeHours = overtimeHours;
    }
    
    public Nurse() {
        super();
    }
    
    public String getId() {
        return super.getId();
    }
    
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
    
    public String getDepartment() {
        return this.department;
    }
    
    public int getOvertimeHours() {
        return this.overtimeHours;
    }
    
    // print
    public void display() {
        super.display();
        System.out.printf("%-15s%-12d%-10f\n",this.department,this.overtimeHours,this.calSalary());
    }
}
