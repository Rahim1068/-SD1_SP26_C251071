package sd_lab_report_2_set_2_problem_6_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_6_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }

        
      if(found){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }
}
