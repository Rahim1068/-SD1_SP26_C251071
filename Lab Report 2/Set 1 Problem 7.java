package sd_lab.report.pkg2_set.pkg1_problem.pkg7_c251071;

import java.util.Scanner;

public class SD_LabReport2_Set1_Problem7_C251071 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
