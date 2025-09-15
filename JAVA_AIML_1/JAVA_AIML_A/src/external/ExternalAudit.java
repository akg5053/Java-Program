package src.external;

import src.company.employees.Employee;

public class ExternalAudit {
    public void audit() {
        Employee emp = new Employee();

        // ❌ private method not accessible
        // emp.showSSN();

        // ❌ default method not accessible (different package)
        // emp.showDepartment();

        // ❌ protected method not accessible (not a subclass)
        // emp.showSalary();

        // ✅ Only public method is accessible
        emp.showName();
    }
}
