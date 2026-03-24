package sd_lab.report.pkg2_set.pkg1_problem.pkg9_c251071;

import java.util.Scanner;

public class SD_LabReport2_Set1_Problem9_C251071 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        
        System.out.println("Sum = " + sum);
    }
}
