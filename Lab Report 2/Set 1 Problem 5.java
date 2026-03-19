package sd_lab.report.pkg2_set.pkg1.problem.pkg5_c251071;

import java.util.Scanner;

public class SD_LabReport2_Set1Problem5_C251071 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        if(op == '+'){
            System.out.println("Result: " + (a + b));
        }
        else if(op == '-'){
            System.out.println("Result: " + (a - b));
        }
        else if(op == '*'){
            System.out.println("Result: " + (a * b));
        }
        else if(op == '/'){
            System.out.println("Result: " + (a / b));
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}
