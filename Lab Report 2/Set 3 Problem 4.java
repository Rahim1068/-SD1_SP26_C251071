package sd_lab_report_2_set_3_problem_4_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_3_Problem_4_C251071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }
    
}
