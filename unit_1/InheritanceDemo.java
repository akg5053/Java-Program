public class InheritanceDemo {
    public static void main(String[] args) {
        fish f = new fish();
        f.breathe();
        f.swim();
    }
}

class animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class fish extends animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Mammal extends animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Dog extends Mammal{
    int legs;

}
class  bird extends  animal{
    void fly(){
        System.out.println("Flying");
    }
}