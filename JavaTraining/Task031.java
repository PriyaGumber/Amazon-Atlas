package JavaTraining;

class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }
}

class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }
}

class My_Calculation2 extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }
}

public class Task031 {
    public static void main(String[] args) {
        int a = 20, b = 10;

        My_Calculation obj1 = new My_Calculation();
        obj1.addition(a, b);
        obj1.subtraction(a, b);
        obj1.multiplication(a, b);

        System.out.println("--------");

        My_Calculation2 obj2 = new My_Calculation2();
        obj2.addition(a, b);
        obj2.subtraction(a, b);
        obj2.multiplication(a, b);
    }
}
