public class ConstructorDemo2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Anand");
        Student s3=new Student(23);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }
}
