package src.company.hr;

import src.company.employees.Employee;

public class HRManager extends Employee {
    public void accessEmployeeData() {
        // ❌ Cannot access private method
        // showSSN();

        // ❌ Cannot access default method (different package)
        // showDepartment();

        // ✅ Can access protected method (inherited)
        showSalary();

        // ✅ Can access public method
        showName();
    }
}
