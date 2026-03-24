package sd_lab_report_2_set_3_problem_3_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_3_Problem_3_C251071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        char first = Character.toUpperCase(word.charAt(0));

        System.out.println(first + word.substring(1));

    }
    
}
