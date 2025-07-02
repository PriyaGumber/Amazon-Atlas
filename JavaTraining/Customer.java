package JavaTraining;

public class Customer {

    String name;
    String id;

    public Customer(String name , String id)
    {
        this.name = name;
        this.id =id;

    }

        public void displayCustomerinfo()
        {
            System.out.println("Customer name : "+ name);
            System.out.println(" Customer id : " + id );
        }
        
    }

    
