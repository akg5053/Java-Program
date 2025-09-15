public class Employee2 {
    public static void main(String[] args) {
        Employee E1= new Employee("Andrew", 4563);
        E1.displayinfo();
        Employee E2 = new Employee("John Snow",9648,89745.65 );
        E2.displayinfo();
    }
}




class Employee{
    String name;
    int id;
    double salary;


    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    Employee(String name, int id, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void displayinfo(){
        System.out.println("Name -> "+ name);
        System.out.println("ID -> "+ id);
        System.out.println("Salary -> %.2f%n"+ salary);
    }


}

