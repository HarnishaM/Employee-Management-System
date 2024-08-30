import java.util.HashMap;


public class EmployeeManagementSystem {
    private HashMap<Integer, Employee> employees = new HashMap<>();
    private HashMap<Integer, Department> departments = new HashMap<>();

    // Add a new employee
    public void addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            System.out.println("Employee with this ID already exists.");
        } else {
            employees.put(employee.getId(), employee);
            System.out.println("Employee added successfully.");
        }
    }

    // Remove an employee
    public void removeEmployee(int employeeId) {
        if (employees.remove(employeeId) != null) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Update employee details
    public void updateEmployee(int employeeId, Employee updatedEmployee) {
        if (employees.containsKey(employeeId)) {
            employees.put(employeeId, updatedEmployee);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Add a new department
    public void addDepartment(Department department) {
        if (departments.containsKey(department.getId())) {
            System.out.println("Department with this ID already exists.");
        } else {
            departments.put(department.getId(), department);
            System.out.println("Department added successfully.");
        }
    }

    // Remove a department
    public void removeDepartment(int departmentId) {
        if (departments.remove(departmentId) != null) {
            System.out.println("Department removed successfully.");
        } else {
            System.out.println("Department not found.");
        }
    }

    // Assign an employee to a department
    public void assignEmployeeToDepartment(int employeeId, int departmentId) {
        if (!employees.containsKey(employeeId)) {
            System.out.println("Employee not found.");
            return;
        }
        if (!departments.containsKey(departmentId)) {
            System.out.println("Department not found.");
            return;
        }
        Employee employee = employees.get(employeeId);
        employee.setDepartmentId(departmentId);
        System.out.println("Employee assigned to department successfully.");
    }

    // Update an employee's department
    public void updateEmployeeDepartment(int employeeId, int newDepartmentId) {
        if (!employees.containsKey(employeeId)) {
            System.out.println("Employee not found.");
            return;
        }
        if (!departments.containsKey(newDepartmentId)) {
            System.out.println("New department not found.");
            return;
        }
        Employee employee = employees.get(employeeId);
        employee.setDepartmentId(newDepartmentId);
        System.out.println("Employee department updated successfully.");
    }

    
   
}
