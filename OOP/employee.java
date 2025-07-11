import java.util.Scanner;
class Employee{
	int empno;
	String name;
	double salary;
	Employee(int empno,String name,double salary){
		this.empno=empno;
		this.name=name;
		this.salary=salary;
		}
	void display(){
		System.out.println("Employee Number:"+empno);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		}
	}
public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int empno = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(empno, name, salary);
        }
        System.out.print("\nEnter employee number to search: ");
        int searchEmpNo = sc.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empno == searchEmpNo) {
                System.out.println("\nEmployee Found:");
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}

