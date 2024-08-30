import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Sample interaction with the system
        try {
            while (true) {
                System.out.println("\nEmployee Management System Menu:");
                System.out.println("1. Add Employee");
                System.out.println("2. Remove Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Add Department");
                System.out.println("5. Remove Department");
                System.out.println("6. Assign Employee to Department");
                System.out.println("7. Update Employee Department");
                System.out.println("8. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int employeeId = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Employee Name: ");
                        String employeeName = scanner.nextLine();
                        System.out.print("Enter Designation: ");
                        String designation = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        System.out.print("Enter Department ID: ");
                        int departmentId = scanner.nextInt();
                        system.addEmployee(new Employee(employeeId, employeeName, designation, salary, departmentId));
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to Remove: ");
                        employeeId = scanner.nextInt();
                        system.removeEmployee(employeeId);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to Update: ");
                        employeeId = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Updated Employee Name: ");
                        employeeName = scanner.nextLine();
                        System.out.print("Enter Updated Designation: ");
                        designation = scanner.nextLine();
                        System.out.print("Enter Updated Salary: ");
                        salary = scanner.nextDouble();
                        System.out.print("Enter Updated Department ID: ");
                        departmentId = scanner.nextInt();
                        system.updateEmployee(employeeId, new Employee(employeeId, employeeName, designation, salary, departmentId));
                        break;

                    case 4:
                        System.out.print("Enter Department ID: ");
                        int depId = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Department Name: ");
                        String departmentName = scanner.nextLine();
                        System.out.print("Enter Department Description: ");
                        String departmentDescription = scanner.nextLine();
                        system.addDepartment(new Department(depId, departmentName, departmentDescription));
                        break;

                    case 5:
                        System.out.print("Enter Department ID to Remove: ");
                        departmentId = scanner.nextInt();
                        system.removeDepartment(departmentId);
                        break;

                    case 6:
                        System.out.print("Enter Employee ID: ");
                        employeeId = scanner.nextInt();
                        System.out.print("Enter Department ID: ");
                        departmentId = scanner.nextInt();
                        system.assignEmployeeToDepartment(employeeId, departmentId);
                        break;

                    case 7:
                        System.out.print("Enter Employee ID: ");
                        employeeId = scanner.nextInt();
                        System.out.print("Enter New Department ID: ");
                        departmentId = scanner.nextInt();
                        system.updateEmployeeDepartment(employeeId, departmentId);
                        break;

                    case 8:
                        System.out.println("Exiting the system. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct data types.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
