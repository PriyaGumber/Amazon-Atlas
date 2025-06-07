package JavaTraining;

public class Task35 {

    void add(char x, char y) {
    System.out.println("char: " + x + ", " + y);
}

void add(int x, int y) {
    System.out.println("int: " + x + ", " + y);
}

public static void main(String[] args) {

    Task35 ts = new Task35();


    ts.add('d', 'a');  // Calls add(char, char)
    ts.add(100, 100);  // Calls add(int, int)
}
    
}
