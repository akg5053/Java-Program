public class corporateemployee {
    public static void main(String[] args) {
        
    }
}


class employee{
    String name;
    int id;
    double salary;
    public employee(){
        System.out.println("Employee consrtuctor called");
    }
    public void detailsemployee(String name , int id ,  double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displaydetail(){
        System.out.println("Employee id = "+ id);
        System.out.println("Name = "+ name);
        System.out.println("Salary = "+ salary);
    }
}

class manager extends employee{
    String department;
     public void setmanagerdetails(String name, int id, double salary, String department){

     }

}

class seniormanager extends manager{
    int teamsize;
    public void setseniormanagerdetails(String name, int id, double salary, String department, int teamsize){

    }


}
