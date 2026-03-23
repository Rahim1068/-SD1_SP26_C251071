package sd_lab_report_2_set_2_problem_5_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_5_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);

    }
}
