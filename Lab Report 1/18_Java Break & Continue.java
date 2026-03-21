package sd_lab_report_1_java_break_continue_c251071;

public class SD_Lab_Report_1_Java_Break_Continue_C251071 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
    }
    
}
