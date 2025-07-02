package JavaTraining;

public class Task013 {
    public static void main(String[] args) {
        System.out.println(" Print numbers 1 to 10 and skip 5 and 7 ");

        for(int i =10; i >0; i --)
        {
            if(i==5 || i==7)
            {
                continue;
            
            }
            System.out.println(i);
        }
    }
    
}
