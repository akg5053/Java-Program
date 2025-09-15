// Interface 1
interface Payable {
    void calculateSalary();
}

// Interface 2
interface Trainable {
    void attendTraining(String trainingName);
}


// Employee class implementing multiple interfaces
class Employee implements Payable, Trainable {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // From Payable
    @Override
    public void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println(name + "'s Total Salary: " + totalSalary);
    }

    // From Trainable
    @Override
    public void attendTraining(String trainingName) {
        System.out.println(name + " is attending training on: " + trainingName);
    }
}
class Intern implements Trainable {
    private String name;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public void attendTraining(String trainingName) {
        System.out.println("Intern " + name + " is attending training: " + trainingName);
    }
}
class PermanentEmployee implements Payable, Trainable {
    private String name;
    private double baseSalary;
    private double bonus;

    public PermanentEmployee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double total = baseSalary + bonus;
        System.out.println("Permanent Employee " + name + "'s Salary: " + total);
    }

    @Override
    public void attendTraining(String trainingName) {
        System.out.println("Permanent Employee " + name + " is attending training: " + trainingName);
    }
}

public class InterfaceMultiInheritanceDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Natasha", 50000, 10000);

        // Using Payable behavior
        emp1.calculateSalary();

        // Using Trainable behavior
        emp1.attendTraining("Java OOP Concepts");
    }
}
