package Menu;


public class Menu {
    public static int getChoice(){
        System.out.println("--------Employee management---------");
        System.out.println("1.Add employee");
        System.out.println("2.View all employee information");
        System.out.println("3.View employee information with the highest salary");
        System.out.println("4.Searh employee");
        System.out.println("5.Exit");
        System.out.print("Your choice: ");
        return Validation.checkInputIntLimit(1,5);
    }
}
