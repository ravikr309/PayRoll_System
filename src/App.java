import java.util.ArrayList;

abstract class Employee {

    private String name;
    private int id;

    // constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // abstract class - not defined will inherit and defined
    public abstract double claculateSalary();

    @Override
    public String toString() {
        return "Employee [ name=" + name + ", ID=" + id + ", Salary=" + claculateSalary() + "]";
    }
}

class FulltimeEmployee extends Employee {

    private double monthlySalary;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        // super because when we want to call constructor of the superclass
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    // must to defined the abstract method
    @Override
    public double claculateSalary() {
        return monthlySalary;
    }

}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {

        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }

    @Override
    public double claculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class PayRollSystem {

    // every employee as a object
    private ArrayList<Employee> employeeList;

    // on call of constructor arraylist will create
    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addemployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmpoloyee(int id) {
        Employee employeToRemove = null;

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeToRemove = employee;
                break;
            }
        }

        if (employeToRemove != null) {
            employeeList.remove(employeToRemove);

        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        PayRollSystem payrollssytem = new PayRollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("vikas", 1, 17000);
        PartTimeEmployee pemp1 = new PartTimeEmployee("sunil", 101, 10, 5);

        payrollssytem.addemployee(emp1);
        payrollssytem.addemployee(pemp1);

        System.out.println("Employe Details");
        payrollssytem.displayEmployees();

        System.out.println("Remove emp");
        payrollssytem.removeEmpoloyee(1);

        System.out.println("Employee remaining");
        payrollssytem.displayEmployees();

    }
}
