class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // final method - bonus rule is fixed for all employees
    public final void calculateBonus() {
        double bonus = salary * 0.10;  // 10% bonus rule
        System.out.println(name + " receives a bonus of: " + bonus);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    // ❌ ERROR: Cannot override calculateBonus() because it is final
    /*
    @Override
    public void calculateBonus() {
        System.out.println("Manager gets 50% bonus"); 
    }
    */
    
    // Manager can still have its own methods
    public void approveLeave() {
        System.out.println(name + " can approve leaves.");
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 60000);
        e.calculateBonus();

        Manager m = new Manager("Bob", 90000);
        m.calculateBonus();   // Calls parent class method (cannot override)
        m.approveLeave();
    }
}

