interface Payable{
    void calculateSalary();
}

interface Trainable{
    void attendTraining(String trainingName);
}

class Employee implements Payable, Trainable{
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double basesalary, double bonus){
        this.name=name;
        this.baseSalary=basesalary;
        this.bonus=bonus;
    }

    @Override
    public void calculateSalary(){
        double totalSalary = baseSalary+bonus;
        System.out.println(name+ " 's Total salary: "+ totalSalary);
    }

    @Override
    public void attendTraining(String trainingName){
        System.out.println("Permanent Employee " + name);
    }
}

public class InterfaceDemo2 {
    
}
