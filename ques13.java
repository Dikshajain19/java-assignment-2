class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Derived class from Employee
class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Derived class from Manager
class SeniorManager extends Manager {
    int teamSize;

    SeniorManager(String name, int id, double salary, String department, int teamSize) {
        super(name, id, salary, department);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}


public class ques13 {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Alice", 101, 120000, "IT", 10);
        sm.displayDetails();
    }
}

