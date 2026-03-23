package sd_lab_report_2_set_2_problem_10_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_10_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);

    }
}
