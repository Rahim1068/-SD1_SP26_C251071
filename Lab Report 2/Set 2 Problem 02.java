package sd_lab_report_2_set_2_problem_2_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_2_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);

    }
}
