package Menu;
import Employee.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
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
    
    //check user input yes/ no. Return TRUE if Y
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
    
    //check doctor id exist, return TRUE if EXITS
    public static boolean checkDoctorIdExist(ArrayList<Doctor> ls, String id, String name) {
        for (Doctor doctor : ls) {
            if ((id == doctor.getId())
                    && name.equalsIgnoreCase(doctor.getName()))
            {
                return false;
            }
        }
        return true;
    }

    //check Nurse id exist, return TRUE if EXITS
    public static boolean checkIdExist(ArrayList<Nurse> ls, String id, String name) {
        for (Nurse nurse : ls) {
            if (id == nurse.getId()
                    && !name.equalsIgnoreCase(nurse.getName())) {
                return false;
            }
        }
        return true;
    }

    //check valid of email format, return true if valid "abc@mail.com" false if ".asds@sfd"
    public boolean checkEmailFormat(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    //check if phone number is 10 num or not, return TRUE if phone number 1 000 000 000 - 9 999 999 999
    public static boolean checkPhoneAmount(String phone){
        System.out.println("Format of phone number: +xx xx xxx-xxxx");
        System.out.println("(Example: +84 35 3552-5568)");
        String regexPhone = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
        /* 
            ^: Start of expression
            (\\+\\d{1,3}()?)?: match country code between 1-3 digits prefixed with '+' symbol, followed by space or no space
            ((\\(\\d{1,3}\\))|\\d{1,3}): is mandatory group of 1-3 digits with or without parenthesus followed by hyphen, space or no space
            \\d{3,4}[-.]?: is mandatory group of 3 or 4 digits followed by hyphen, space or no space
            \\d{4}: is mandatory group of last 4 digits
            $: end of expression
        */
        return Pattern.matches(regexPhone, phone);
    }

}
