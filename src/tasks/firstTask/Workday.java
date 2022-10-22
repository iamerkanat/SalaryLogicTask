import java.util.Scanner;

public class Workday {
    public static int pay(int x){
        return x = 8; //base pay of per hour
    }

    public static void main(String[] args) {
        int max = 60;
        int overtime = 40;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hours of working:");
        double Hours = scan.nextDouble();

        if(Hours<40 && Hours < 60){
            Hours *= (pay(8) * 1.5); //more than 40 hourse, then 1.5 * base pay
        }

        System.out.println("You receive: "+Hours);


    }
}
