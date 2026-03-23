package sd_lab_report_2_set_2_problem_7_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_7_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array (Ascending):");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
