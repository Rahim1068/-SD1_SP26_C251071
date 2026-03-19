package sd_lab.report.pkg2_set.pkg1.problem.pkg4;

import java.util.Scanner;

public class SD_LabReport2_Set1Problem4 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        int max = a;  
        
        if(b > max){
            max = b;
        }
        
        if(c > max){
            max = c;
        }
        
        System.out.println("Largest number is: " + max);
        
    }
}
