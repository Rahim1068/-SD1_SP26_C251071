package sd_lab_report_2_set_3_problem_5_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_3_Problem_5_C251071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double avg = (A + B) / 2;

        if (avg > C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    
}
