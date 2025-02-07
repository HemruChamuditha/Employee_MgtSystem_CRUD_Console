public class Employee {

    //Employee Attributes
    private int ID;
    private String Name;
    private String Department;
    private double Salary;

    //Parameterized Constructor
    Employee(int ID, String Name, String Department, double Salary){
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.Salary = Salary;
    }

    //Getters and setters for access to private fields within the Employee class
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    //Overriding the toString method of Object Class
    @Override
    public String toString(){
        return "Id : " + ID + ", Name : " + Name + ", Department : " + Department + ", Salary : " + Salary;
    }
}
