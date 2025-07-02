public class Methods2 {
    public static void main(String[] args) {
        System.out.println(" Lets create methods for the triangles");
        Triangle();
    }

    public static void Triangle()
    {
        int row = 0;
        while (row <5)
        {
            int i = 0;
            while (i<= row)
            {
                System.out.print(" *");
                i++;
            }

                System.out.println();
            row++;
        }

        int row1 = 3;

        while(row1 >=0)
        {
            int i = 0;

            while (i <=row1)
            {
                System.out.print(" *");
                i++;
            }
                System.out.println();
            row1--;
        }
    }
    
}
