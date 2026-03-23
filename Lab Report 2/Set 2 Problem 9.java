package sd_lab_report_2_set_2_problem_9_c251071;

import java.util.Scanner;

public class SD_Lab_Report_2_Set_2_Problem_9_C251071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);

    }
}
