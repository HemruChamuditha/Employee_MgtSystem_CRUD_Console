import java.util.ArrayList;

class EmployeeManager {

    ArrayList<Employee> employees = new ArrayList<>();

    //This method is used to adding employees
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee successfully added");
        System.out.println();
    }

    //This method is used to retrieve Employee Data
    public void retrieveEmployee() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    //This method is used ro Update Data
    public void updateEmployee(int ID, String name, String department, Double salary) {
        for (Employee emp : employees) {
            if (emp.getID() == ID) {
                emp.setName(name);
                emp.setDepartment(department);
                emp.setSalary(salary);
                System.out.println("Employee successfully updated");
                System.out.println();
            }
        }
    }

    //This method is used to Delete Data
    public void deleteEmployee(int ID) {
        for (Employee emp : employees) {
            if (emp.getID() == ID) {
                employees.remove(emp);
                System.out.println("Employee successfully deleted");
                System.out.println();
            }
        }
    }

}