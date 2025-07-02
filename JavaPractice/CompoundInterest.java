import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Lets calculate the compund interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide values of Principal Rate and Time ");
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        double CompoundInterest = P*T *(1+R/100);
        System.out.println(" Compound Interest is : " + CompoundInterest);
        sc.close();
    }

    
}
