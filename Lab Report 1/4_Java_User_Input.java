package sd_lab_report_1_java_user_input_c251071;

import java.util.Scanner;

public class SD_Lab_Report_1_Java_User_Input_C251071 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        
    }
}
