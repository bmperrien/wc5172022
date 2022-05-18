import java.util.Stack;

public class StackMin {
    /*
    2) Stack Min: How would you design a stack which,
    in addition to push and pop, has a function min which returns the minimum element?
    Push, pop and min should all operate in 0(1) time.
     */

    private Stack<Integer> stack;
    private Integer min;
    private int size = 0;

    public StackMin(){
        stack = new Stack<>();
    }

    //not sure how to make pop, O(1)
    public void pop(){
        if(size == 0){
            System.out.println("Stack empty, no need to pop");
            return;
        }
        if(stack.peek() == min){
            stack.pop();
            min = stack.peek();
            for(int i = 0; i < size-1; i++){
                if(stack.get(i) < min){
                    min = stack.get(i);
                }
            }

        }else{
            stack.pop();
        }
        size--;
    }

    public void push(Integer x){
        if(size == 0){
            min = x;
        }else if(x < min){
                min = x;
            }
        stack.push(x);
        size++;
    }

    public void getMin(){
        if(size == 0){
            System.out.println("Stack empty");
            return;
        }
        System.out.println("The min is: " + min);
    }
}
