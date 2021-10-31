public class Menu {
    public static int getChoice(){
        System.out.println("--------Doctor management---------");
        System.out.println("1.Add doctor");
        System.out.println("2.Update doctor");
        System.out.println("3.Delete doctor");
        System.out.println("4.View information");
        System.out.println("5.Exit");
        System.out.print("Your choice: ");
        return Validation.checkInputLimit(1,5);
    }
}
