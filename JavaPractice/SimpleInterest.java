import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println(" Lets calculate Simple interest ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal is : ");
        int P = sc.nextInt();
        System.out.println(" Rate and Time are : ");
        int R = sc.nextInt();
        int T = sc.nextInt();
        double SimpleInterest = (P*R*T)/100;
        System.out.println(" SI is : " + SimpleInterest);
        sc.close();

    }
}
