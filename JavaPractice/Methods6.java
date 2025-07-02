public class Methods6 {
    public static void main(String[] args) {
        System.out.println(" Lets create a method to count the number of objects created in a class");

        Test obj = new Test();
        Test obj2 = new Test();


        int o = Test.get();

        System.out.println("No of instances created: " + o);

    }

}
    
    class Test {

    public static int i =0;

    Test() {
       i++;
    }

    public  static int get() {
        return i;
    }

    
    }


