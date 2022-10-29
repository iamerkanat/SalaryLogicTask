package firstTask;

import java.util.Scanner;

public class Workday {
    public static double payPerHour(double x){
        return x; //base pay of per hour
    }
    //ONLY Hours of working for WEEK 0<40<60
    public static int Hours(int y){
        return y;
    }
    //for month salary
    public static int forMonth(int z){
        return z = 4; //1 month = 4 weeks;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // double PerHourS = 8; //minimal
        // int Hour = 1; //real hours on count
        int max = 60; //maximal for WEEK
        int overtime = 40; // BONUS SCORE

        System.out.println("Enter your rate per hour:");
        Double PerHour= payPerHour(scan.nextDouble());
        System.out.println("How many hours did you work for this week?");
        int Hours = Hours(scan.nextInt());

        //usual situation, when you work less 40 hours
        if(Hours <= overtime){ //<=40
            System.out.println("YOUR SALARY FOR THIS WEEK: "+ (int)(PerHour * Hours));
            System.out.println("YOUR SALARY FOR MONTH will be: "+ (int)(PerHour*Hours*forMonth(4)) );
        }

        //bonus, when you work more than 40 hours
        double Usual = PerHour * overtime;
        if(Hours>overtime && Hours < max){
            //base bay until 40hours
            //after 40 hours, (base pay)*1.5 until 60
            // (60- Hours)*1.5 = BONUS
            //Usual salary + BONUS = BONUS Salary

            double BonusSalary = Usual + PerHour * ((Hours - overtime)*1.5);
            System.out.println("Your salary for this week: " + BonusSalary);
            System.out.println("Your salary for this month will be: " + BonusSalary*forMonth(4));

        }







    }
}
