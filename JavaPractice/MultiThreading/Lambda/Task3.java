package MultiThreading.Lambda;

@FunctionalInterface
interface MyInterface {
    double getPiValue();
}

public class Task3 {
    public static void main(String[] args) {
        MyInterface ref;
        ref = () -> 3.1415;
        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}


