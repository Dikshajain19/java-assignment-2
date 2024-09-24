import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic_salary = sc.nextDouble();
    }

    void calculateGrossSalary() {
        double hra = 0.10 * basic_salary; 
        double da = 0.05 * basic_salary;  
        gross_salary = basic_salary + hra + da;
    }

    
    void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }

   
}
class ques14{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}
