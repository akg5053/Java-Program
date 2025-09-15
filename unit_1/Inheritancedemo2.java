public class Inheritancedemo2 {
    public static void main(String[] args) {
        Bird Parrot = new Bird();
        Parrot.eats();
        Parrot.fly();
    }
}
class Animal{
    String colour;
    void eats(){
        System.out.println("Eats");
    }
    protected void breathe(){
        System.out.println("Breaths");
    }
}
class Fish extends  Animal{
    void swim(){
        System.out.println("Swims");
    }

}
class Bird extends  Animal{
    void fly(){
        System.out.println("Flying");
    }
}





