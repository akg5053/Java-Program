package src.company.employees;

public class Employee {
    // Variables
    private String ssn = "123-45-6789";   // private
    String department = "IT";             // default
    protected double salary = 50000;      // protected
    public String name = "Alice";         // public

    // Methods
    private void showSSN() {
        System.out.println("SSN: " + ssn);
    }

    void showDepartment() {  // default
        System.out.println("Department: " + department);
    }

    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }

    public void showName() {
        System.out.println("Name: " + name);
    }

    // Method to demonstrate access within the same class
    public void showAllDetails() {
        showSSN();        // private → accessible inside class
        showDepartment(); // default → accessible inside class
        showSalary();     // protected → accessible inside class
        showName();       // public → accessible inside class
    }
}
