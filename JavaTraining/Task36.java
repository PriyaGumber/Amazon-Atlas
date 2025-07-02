package JavaTraining;

public class Task36 {

    void add (int x , float yf)
    {
        System.out.println("int x : " +x + " float y : "+ yf);

    }

    void add (float xf , int y)
    {
        System.out.println("int y : " +y + " float xf : "+ xf);
    }

    public static void main(String[] args) {
        Task36 ts = new Task36();
        ts.add(12, 12.8f);
        ts.add(2 , 12.7f);

    }
    
}
