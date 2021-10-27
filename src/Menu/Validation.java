import java.util.ArrayList;
import java.util.Scanner;
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < 0 ) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input can't be negetive");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //check user input yes/ no
    public static boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //check user input u / d
    public static boolean checkInputUD() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input u/U
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            //return false if user input d/D
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }

    //check user input course
    public static String checkInputGender() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check input course in java/ .net/ c/c++
            if (result.equalsIgnoreCase("F")
                    || result.equalsIgnoreCase("FM"))
            {
                return result.toUpperCase();
            }
            System.err.println("There are only 2 gender valid: F, FM");
            System.out.print("Enter again: ");
        }
    }

    //check student exist
    public static boolean checkStudentExist(ArrayList<Student> ls, int id,
        String name, int age, String gender, String address) {
        for (Student student : ls) {
            if ((id == student.getId())
                    && name.equalsIgnoreCase(student.getName())
                    && gender.equalsIgnoreCase(student.getGender())
                    && address.equalsIgnoreCase(student.getAddress())
                    && age == student.getAge()) {
                return false;
            }
        }
        return true;
    }



    //check id and exist
    public static boolean checkIdExist(ArrayList<Student> ls, int id, String name) {
        for (Student student : ls) {
            if (id == student.getId()
                    && !name.equalsIgnoreCase(student.getName())) {
                return false;
            }
        }
        return true;
    }

    //check user change or not
    public static boolean checkChangeInfomation(Student student, int id,
        String name, int age, String gender, String address) {
        if (id == student.getId()
                && age == student.getAge()
                && name.equalsIgnoreCase(student.getName())
                && address.equalsIgnoreCase(student.getAddress())
                && gender.equalsIgnoreCase(student.getGender())) {
            return false;
        }
        return true;
    }

}
