public class new1 {
    public static void main(String[] args) {
       Employee A1= new Employee();
       A1.id=469;
       A1.Department="HR";
       A1.name="Andrew";
       A1.setSalary(50000);
       A1.displayInfo();
        
    }
}

class Employee{
    public int id;
    private int salary;
    protected String name;
    String Department;
    


   

    public void displayInfo(){
        System.out.println("Name -> "+name);
        System.out.println("ID -> "+id);
        System.out.println("Department -> "+Department);
        System.out.println("Salary -> "+salary);
    }


    public void setSalary(int newSalary){
        if(newSalary>0){
            this.salary=newSalary;
        }else{
            System.out.println("Error , Salary must me positive value");
        }
    }
}