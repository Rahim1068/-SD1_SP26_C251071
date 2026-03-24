package sd_lab_report_2_set_3_problem_1_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_3_Problem_1_C251071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A & C:");

        int A = sc.nextInt();
        int C = sc.nextInt();

        if ((A + C) % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    
}
