
public class PolymorphismDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee("Anand", 101, 50000);
        e1.showDetails();
        e1.showDetails("HR");
        e1.work();

        System.out.println();

        Manager m1 = new Manager("Rahul", 201, 80000, "IT");
        m1.showDetails();
        m1.showDetails("IT");
        m1.work();
        m1.show();
    }
}

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee() {

    }

    public void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public void showDetails(String department) {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Department: " + department);
    }

    public void work() {
        System.out.println(name + " is working as an Employee.");
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    public void show() {
        System.out.println("Manager Details: " + name + " (" + department + ")");
    }
}

class Developer extends Employee {

    String programlang;

    Developer(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.programlang = programlang;
    }

    @Override

    
    public void work() {
        System.out.println("This is programming");
    }
}
