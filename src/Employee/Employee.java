package Employee;

abstract class Employee {
    protected String id;
    protected String name;
    protected String type;
    protected String phone;
    protected String email;
    protected float coefficient;

    public Employee(){}
    
    public Employee(String id, String name, String type, String phone, String email, float coefficient){
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
    public void setCoefficient(float coefficient){
        this.coefficient = coefficient;
    }
    public float getCoefficient(){
        return this.coefficient;
    }
}
