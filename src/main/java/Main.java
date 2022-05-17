import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(7);
        l1.add(1);
        l1.add(6);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(9);
        l2.add(2);
        l2.add(7);
        System.out.println(SumLists.sumLists(l1, l2));

    }
}
