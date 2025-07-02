public class Methods {

    

    public static void pattern()
    {
        int rows=0;
        while (rows <5){

        int i =0 ;
        while ( i <= rows){
            System.out.print(" * ");
            i++;

        }

        rows++;

        System.out.println();

    }
    
    
    }
    public static void main(String[] args) {
        System.out.println(" lets print star in a traingular shape");

        pattern();
    }
    
}
