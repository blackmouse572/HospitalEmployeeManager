package Employee;

import java.util.Scanner;

abstract class Employee {
    private String id;
    private String name;
    private String type;
    private String phone;
    private String email;
    private float coefficient;
    public Employee(){};
    public Employee(String id, String name, String type, String phone, String email, float coefficient){
        this.id = id;
        this.name = name;
        this.type = type;
        this.phone = phone;
        this.email = email;
        this.coefficient = coefficient;
    }
    abstract float calSalary();
    public void display(){
        System.out.println("ID: ");
        System.out.println("Name: ");
        System.out.println("Type: ");
        System.out.println("Phone: ");
        System.out.println("Email: ");
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
        System.out.print("Enter Coefficient: ");
    }
}
