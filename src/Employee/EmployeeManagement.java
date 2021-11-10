package Employee;

import java.util.ArrayList;
import java.util.Scanner;
import Menu.Validation;

public class EmployeeManagement {

    Scanner sc = new Scanner(System.in);
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Nurse> nurses = new ArrayList<>();

    public void addDoctor(){
        System.out.print("Input ID: ");
        String id = Validation.checkDoctorIdExist(doctors);
        System.out.print("Input name: ");
        String name = Validation.checkInputString();
        System.out.print("Input phone: ");
        String phone;
        do{
            phone = sc.nextLine();
        }while(!Validation.checkPhoneAmount(phone));
        System.out.println("Input mail: ");
        String email;
        do{
            email = sc.nextLine();
        }while(!Validation.checkEmailFormat(email));
        System.out.print("Input coefficient: ");
        int coefficient = Validation.checkInputInt();
        System.out.print("Input major: ");
        String major = Validation.checkInputString();
        System.out.print("Input level: ");
        int level = Validation.checkInputInt();
        System.out.print("Input allowance: ");
        int allowance = Validation.checkInputInt();
        doctors.add(new Doctor(id,name,phone,email,coefficient,major,level,allowance));
    }

    public void addNurse(){
        System.out.print("Input ID: ");
        String id = Validation.checkNurseIdExist(nurses);
        System.out.print("Input name: ");
        String name = Validation.checkInputString();
        System.out.print("Input phone: ");
        String phone;
        do{
            phone = sc.nextLine();
        }while(!Validation.checkPhoneAmount(phone));
        System.out.print("Input mail: ");
        String email;
        do{
            email = sc.nextLine();
        }while(!Validation.checkEmailFormat(email));
        System.out.println("Input coefficient: ");
        int coefficient = Validation.checkInputInt();
        System.out.print("Input department: ");
        String department = Validation.checkInputString();
        System.out.print("Input overtime: ");
        int overtime = Validation.checkInputInt();
        nurses.add(new Nurse(id,name,phone,email,coefficient,department,overtime));
    }

    public void viewAll(){
        System.out.println("DOCTOR");
        System.out.printf("%-10s%-15s%-20s%-20s%-15s%-11s%-6s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","MAJOR","LEVEL","ALLOWANCE","SALARY");
        for (Doctor y: doctors) {
            y.display();
        }
        System.out.println("NURSE");
        System.out.printf("%-10s%-15s%-20s%-20s%-15s%-15s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","DEPARTMENT","OVERTIME","SALARY");
        for (Nurse x: nurses) {
            x.display();
        }
    }

    public double maxSalary(){
        double max = 0;
        for (Doctor x:doctors) {
            if(x.calSalary() > max) {
                max = x.calSalary();
            }
        }
        for (Nurse y:nurses) {
            if(y.calSalary() > max){
                max = y.calSalary();
            }
        }
        return max;
    }

    public void viewHighestSalary(){
        double max = maxSalary();
        for (Doctor x:doctors) {
            if(x.calSalary() == max){
                System.out.printf("%-10s%-15s%-20s%-20s%-15s%-11s%-6s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","MAJOR","LEVEL","ALLOWANCE","SALARY");
                x.display();
            }
        }
        for (Nurse y:nurses) {
            if(y.calSalary() == max){
                System.out.printf("%-10s%-15s%-20s%-20s%-15s%-15s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","DEPARTMENT","OVERTIME","SALARY");
                y.display();
            }
        }
    }

    public void searchDoctor(){
        System.out.print("Input Name: ");
        String name = Validation.checkInputString();
        int count =0;
        for (Doctor x :doctors) {
            if(x.getName().contains(name)){
                count ++;
                System.out.printf("%-10s%-15s%-20s%-20s%-15s%-15s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","DEPARTMENT","OVERTIME","SALARY");
                x.display();
            }
        }
        if (count == 0){
            System.err.println("Not found!");
        }
    }

    public void searchNurse(){
        System.out.print("Input Name: ");
        String name = Validation.checkInputString();
        int count = 0;
        for (Nurse x:nurses) {
            if(x.getName().contains(name)){
                count++;
                System.out.printf("%-10s%-15s%-20s%-20s%-15s%-15s%-12s%-10s\n","ID","NAME","PHONE","EMAIL","COEFFICIENT","DEPARTMENT","OVERTIME","SALARY");
                x.display();
            }
        }
        if (count == 0){
            System.err.println("Not found!");
        }
    }
}
