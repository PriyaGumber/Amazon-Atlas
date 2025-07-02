import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println(" Lets convert the temperature from Far to Cel");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the temperature of your room");
        Float far = sc.nextFloat();
        Float cel = (far -32)*5/9;
        System.out.println("The temp in Cel is : " + cel);
        sc.close();

    }
    
}
