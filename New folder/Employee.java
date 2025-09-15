

public class Employee {
    String name;
    int id;

    class Address {
        String city;  
        String state;

        Address(String city, String state){
            this.city=city;
            this.state=state;
        }
    

    

    void displayEmployee(){
        System.out.println("Employee Id " + id);
        System.out.println("Employee Name =" + name);
        System.out.println("City "+ city + "State = "+ state);
    }
}

}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name="Rahul";
        emp1.id=101;

        Employee.address addr1 = emp1.new Address("Delhi", "Del");
        addr1.displayEmployee();
    }
}
