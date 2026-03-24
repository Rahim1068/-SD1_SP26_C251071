package sd_lab.report.pkg2_set.pkg1_problem8_c251071;

import java.util.Scanner;

public class SD_LabReport2_Set1_Problem8_C251071 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        long fact = 1;
        
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        
        System.out.println("Factorial = " + fact);
    }
}
