import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        int employeeID = 0;

        boolean isContinue = true;

        while (isContinue) {

            System.out.println("===== Employee Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.println();

            System.out.print("Choose an option : ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Add Employee");

                    System.out.print("Enter Name : ");
                    String name = input.next();

                    System.out.print("Enter Department : ");
                    String department = input.next();

                    System.out.print("Enter Salary : ");
                    Double salary = input.nextDouble();

                    employeeID = employeeID + 1;

                    Employee employee = new Employee(employeeID, name, department, salary);
                    manager.addEmployee(employee);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Employee List : ");
                    manager.retrieveEmployee();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Update Employee");

                    System.out.print("Enter Employee ID to Update : ");
                    int empID = input.nextInt();

                    System.out.print("Enter New Name : ");
                    String newName = input.next();

                    System.out.print("Enter New Department : ");
                    String newDepartment = input.next();

                    System.out.print("Enter New Salary : ");
                    Double newSalary = input.nextDouble();

                    manager.updateEmployee(empID, newName, newDepartment, newSalary);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Delete Employee");

                    System.out.print("Enter Employee ID to Delete : ");
                    int employeeId = input.nextInt();

                    manager.deleteEmployee(employeeId);
                    break;

                case 5:
                    System.out.println("Exiting the System, Goodbye!");
                    isContinue = false;
                    break;
            }

        }







    }
}
