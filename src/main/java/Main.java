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


        LinkedList<Integer> l3 = new LinkedList<>();
        l3.add(6);
        l3.add(1);
        l3.add(7);
        LinkedList<Integer> l4 = new LinkedList<>();
        l4.add(4);
        l4.add(9);
        l4.add(5);
        System.out.println(SumLists.forwardSumLists(l3,l4));

    }
}
