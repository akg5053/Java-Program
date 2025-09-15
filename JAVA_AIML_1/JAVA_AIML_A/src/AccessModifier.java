package src;

import src.company.employees.Employee;
import src.company.hr.HRManager;
import src.external.ExternalAudit;

public class AccessModifier {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("---- Inside Employee Class ----");
        emp.showAllDetails();

        System.out.println("\n---- Inside HRManager (Subclass in different package) ----");
        HRManager hr = new HRManager();
        hr.accessEmployeeData();

        System.out.println("\n---- Inside ExternalAudit (Different package, no inheritance) ----");
        ExternalAudit audit = new ExternalAudit();
        audit.audit();
    }
}