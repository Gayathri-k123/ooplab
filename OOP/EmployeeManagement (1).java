import java.util.ArrayList;
import java.util.Scanner;
abstract class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
interface Benefits {
    double calculateBenefits();
}
class Manager extends Employee implements Benefits {
    double bonus;
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return salary + bonus;
    }
    public double calculateBenefits() {
        return 5000; // Fixed insurance benefit
    }
    void assignProject(String projectName) {
        System.out.println(name + " assigned to project: " + projectName);
    }
    void assignProject(String projectName, int teamSize) {
        System.out.println(name + " assigned to project: " + projectName + " with team size: " + teamSize);
    }
}
class Developer extends Employee implements Benefits {
    int experience;
    Developer(String name, double salary, int experience) {
        super(name, salary);
        this.experience = experience;
    }
    double calculateSalary() {
        return salary + (experience * 1000);
    }
    public double calculateBenefits() {
        return experience * 500; // Allowance based on experience
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        employees.add(new Manager("Alice", 50000, 10000));
        employees.add(new Developer("Bob", 40000, 5));
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Benefits) {
                System.out.println("Benefits: " + ((Benefits) emp).calculateBenefits());
            }
            System.out.println();
        }
    }
}


