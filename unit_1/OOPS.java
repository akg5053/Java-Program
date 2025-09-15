
public class OOPS {

    public static void main(String[] args) {

        // Pen p1 = new Pen();
        // p1.color = "Yellow";
        // p1.tip = 5;
        // System.out.println(p1.color);

        // p1.changeColor("Blue");
        // System.out.println(p1.color);

        // System.out.println(p1.tip);

        // p1.changeTip(2);
        // System.out.println(p1.tip);

        // Student Akash = new Student();
        // Akash.age=19;
        // System.out.println(Akash.age);

        // Akash.changeAge(20);
        // System.out.println(Akash.age);


        // Akash.name="akash";

        // Employee A= new Employee();
        // A.salary=5000;
        // System.out.println(A.salary);
        Employee A=new Employee();
        A.name="Andrew";
        A.id=84657;
        A.age=26;
        A.department="HR";
        A.desig="Senior";
        A.salary=156943.78;

        A.displayinfo();
        A.changeId(4695);
        A.displayinfo();

        
    }
}

class Pen {

    String color;
    int tip;

    void changeColor(String changecolor) {
        color = changecolor;
    }

    void changeTip(int newtip) {
        tip = newtip;
    }
}

class Student {

    String name;
    int age;

    void changeName(String changename) {
        name = changename;
    }

    void changeAge(int changeage) {
        age = changeage;
    }
}

class Employee{
    String name;
    int id;
    int age;
    String desig;
    double salary;
    String department;

    public void displayinfo(){
        System.out.println("Name -> "+ name);
        System.out.println("ID -> "+ id);
        System.out.println("AGE -> "+age);
        System.out.println("Designation -> "+ desig);
        System.out.println("Salary -> "+ salary);
        System.out.println("Department -> "+department);
    }

    public void changeName(String newname){
        name=newname;
    }

    public void changeId(int newId){
        id=newId;
    }
    public void changeAge(int newAge){
        age = newAge;
    }
    public void changeDesignation(String newDesignation){
        desig= newDesignation;
    }
    public void changeSalary(int newSalary){
        salary+=newSalary;
    }
    public void changeDepartment(String newDepartment){
        department=newDepartment  ;
    }
   
}


// class Employe{
//     String name;
//     int id;
//     double salary;


// }
