package sd_lab_report_2_set_2_problem_8_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_8_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
