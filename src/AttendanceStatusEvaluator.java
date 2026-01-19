import java.util.*;
import java.util.Scanner;

class AttendanceStatusEvaluator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Status = sc.nextInt();

        if(Status>85){
            System.out.println("Excellent");
        }
        else if(Status<=85 && Status>=60){
            System.out.println("Satisfactory");
        }
        else if(Status<60){
            System.out.println("Poor");
        }
        else{
            System.out.println("case-sensitive");
        }
    }
}

