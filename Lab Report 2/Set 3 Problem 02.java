package sd_lab_report_2_set_3_problem_2_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_3_Problem_2_C251071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String word = sc.next();

        if (word.length() > 10) {
            System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
        } else {
            System.out.println(word);
        }

    }
    
}
