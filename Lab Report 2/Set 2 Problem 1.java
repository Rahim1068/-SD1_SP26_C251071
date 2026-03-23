package sd_lab_report_2_set_2_problem_1_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_1_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The 5 numbers you entered are:");

        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        
    }
}
