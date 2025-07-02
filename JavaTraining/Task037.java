package JavaTraining;

public class Task037 {

    private int pwd;
    protected int salary;
    public int empid;

    public Task037() {
        pwd = 1234;
        salary = 30000;
        empid = 101;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

   
    public static class Hr extends Task037 {

        public Hr() {
            setPwd(1254); //for protected 
            salary = 50000; // accessible 
            empid = 10001;  // accessible 
        }

        public static void main(String[] args) {
            Hr hr = new Hr();
            System.out.println("EmpID: " + hr.empid);
            System.out.println("Salary: " + hr.salary);
            System.out.println("Password: " + hr.getPwd());
        }
    }
}
