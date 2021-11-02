package Employee;

abstract class Employee {
    private String id;
    private String name;
    private String type;
    private String phone;
    private String email;
    private double coefficient;

    public Employee(){}
    
    public Employee(String id, String name, String type, String phone, String email, double coefficient){
        this.id = id;
        this.name = name;
        this.type = type;
        this.phone = phone;
        this.email = email;
        this.coefficient = coefficient;
    }
    abstract double calSalary();
    public void display(){
        System.out.printf("%-6s",this.id);
        System.out.printf("%-10s",this.name);
        System.out.printf("%-10s",this.type);
        System.out.printf("%-12s",this.phone);
        System.out.printf("%-25s",this.email);
        System.out.printf("%-4f",this.coefficient);
    }
//Get and Set
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setCoefficient(double coefficient){
        this.coefficient = coefficient;
    }
    public double getCoefficient(){
        return this.coefficient;
    }
