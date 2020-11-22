// Problem: https://leetcode.com/problems/min-stack/

// COMPILE & RUN: `javac Min_Stack.java && java Min_Stack`

// Solution:
public class Min_Stack {

    // set capacity to 10
    public int capacity = 10;
    public int[] stack_contents = new int[capacity];

    /** initialize your data structure here. */
    public Min_Stack() {
        int[] stack_contents = new int[capacity];

        this.stack_contents = stack_contents;
    }

    public void push(int x) {
        // if not exceeding size:
        if (this.stack_contents.length < this.capacity) {
            this.stack_contents[this.stack_contents.length - 1] = x;
        } else {
            // increase capacity of stack
            this.capacity += 10;
            // re-attempt pushing
            this.stack_contents[this.stack_contents.length - 1] = x;
        }
    }

    public void pop() {
        // removes last element of the array
        int lastElement = 0;
        int j = 0;
        for (int i : stack_contents) {
            if (i != 0) {
                lastElement = i;
                stack_contents[j] = 0;
            }
            j++;
        }
        System.out.println("Popped " + lastElement + " from the stack");

    }

    public int top() throws Exception {
        // check for size in try catch:
        int count = 0;
        int top = 0;
        for (int i : stack_contents) {
            if (i == 0) {
                count++;
            } else {
                top = i;
            }
            if (count == stack_contents.length) {
                throw new Exception("stack is empty");
            }
        }
        return top;
    }

    public int getMin() {
        return 0;
    }

    /**
     * Your MinStack object will be instantiated and called as such: MinStack obj =
     * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
     * = obj.getMin();
     */
    public static void main(String[] args) {
        System.out.println("Creating a Stack...");
        Min_Stack example_stack = new Min_Stack();

        try {
            System.out.println(example_stack.top());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pushing 23 to stack");
        example_stack.push(23);

        try {
            System.out.println(example_stack.top());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        example_stack.pop();

        try {
            System.out.println(example_stack.top());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
