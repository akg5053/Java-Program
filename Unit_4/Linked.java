import java.util.LinkedList;
public class Linked{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(0);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}