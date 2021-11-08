package Menu;

import Employee.EmployeeManagement;


public class Main {
    public static void main(String[] args){
        EmployeeManagement em = new EmployeeManagement();

        boolean check = true;

        while(check){
            switch (Menu.getChoice()){
                case 1->{
                    System.out.print("press 1 to add Doctor or 2 to add Nurse: ");
                    int choice = Validation.checkInputIntLimit(1,2);
                    do{
                        if(choice == 1){
                            em.addDoctor();
                        } else {
                            em.addNurse();
                        }
                        System.out.print("Do you want to continue(Y/N)? ");
                    }while(Validation.checkInputYN());
                }
                case 2-> em.viewAll();
                case 3-> em.viewHighestSalary();
                case 4->{
                    System.out.print("Input type of employee (1.Doctor/2.Nurse): ");
                    int choice = Validation.checkInputIntLimit(1,2);
                    if(choice == 1){
                        em.searchDoctor();
                    }else{
                        em.searchNurse();
                    }
                }
                case 5->check=false;
            }
        }
    }
}
