package JavaDay4.Bai14;

public class Employee {
    private int id;

    private String firstName;

    private String lastname;

    private double salary;

    public void setEmployeeInfo(int id, String firstName, String lastname, double salary){
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }

    public String setLastName(String lastname){
        this.lastname = lastname;
        return lastname;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastname;
    }

    public String getName(){
        return firstName+" "+lastname;
    }


    public double getManualSalary(){
        return salary*12;
    }

    public double raisedSalary(double percent){
        salary = salary + salary*percent/100;
        return salary;
    }

    public void getEmployeeInfo()
    {
        System.out.println("Thông tin nhân viên:");
        System.out.println("ID:"+id);
        System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastname);
        System.out.println("Salary:"+salary);
    }
}
