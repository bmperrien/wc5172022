import java.util.LinkedList;

public class SumLists {
    /*
    1) Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.

EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.

FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
Output: 9 -> 1 -> 2. That is, 912.
     */

    public static LinkedList<Integer> sumLists(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> sum = new LinkedList<>();
        boolean carry = false;

        int i = 0;

        while(i < l1.size() || i < l2.size()){
            if(i > l1.size()-1){
                if(carry){
                    sum.add(l2.get(i)+1);
                    carry = false;
                }else{
                    sum.add(l2.get(i));
                }
                i++;
                continue;
            }else if(i > l2.size()-1){
                if(carry){
                    sum.add(l1.get(i)+1);
                    carry = false;
                }else{
                    sum.add(l1.get(i));
                }
                i++;
                continue;
            }

            if(carry){
                l1.set(i, l1.get(i) + 1);
                carry = false;
            }

            if(l1.get(i) + l2.get(i) < 10){
                sum.add(l1.get(i) + l2.get(i));
            }else{
                sum.add(l1.get(i)+l2.get(i)-10);
                carry = true;
            }
            i++;
        }


        return sum;
    }

    
    //Doesn't work properly when first digit > 10
    public static LinkedList<Integer> forwardSumLists(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> sum = new LinkedList<>();
        if(l1.getFirst() + l2.getFirst() > 10){
            sum.add(1);
            sum.add(l1.getFirst() + l2.getFirst() - 10);
        }else{
            sum.add(l1.getFirst() + l2.getFirst());
        }

        int i = 1;

        while(i < l1.size() || i < l2.size()){
            if(l1.get(i) + l2.get(i) < 10){
                sum.add(l1.get(i) + l2.get(i));
            }else{
                sum.set(i-1, sum.get(i-1) + 1);
                sum.add(l1.get(i) + l2.get(i) - 10);
            }
            i++;
        }



        return sum;
    }
}
