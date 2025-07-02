// helper class

public class Students
{
   private String name;
   private int rollno;
   private double marks;

   public void setName(String name){
      this.name = name;
   }

   public void setRollno( int rollno){
      this.rollno = rollno;
   }

   public void setMarks(double marks){
      this.marks =marks;
   }

   public String getName()
   {
      return name;
   }

   public int getrollno(){
      return rollno;
   }

   public double getmarks(){
      return marks;
   }


}

public String getGrades()
{
   int marks;
   if (marks > 80){
      return " A" ;
   }
   else if (marks > 60){
      return " B";
   }
   else if (marks > 40){
      return " C";

   }

   else {
         return " FAIL" ;
      }
   }
   
public class GetSet {
   public static void main(String[] args) {
      Students st = new Students();
      System.out.println(" Name of the student is:  " + (st.getName()));
      System.out.println(" Rollno of the student is : " + (st.getrollno()));
      System.out.println("Marks of the number is : " + (st.getmarks()));


   }
   
      
   }

    


    

   
