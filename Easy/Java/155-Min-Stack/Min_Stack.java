// Problem: https://leetcode.com/problems/min-stack/

// COMPILE & RUN: `javac Min_Stack.java && java Min_Stack`

// Solution:
public class Min_Stack {

    // set capacity to 10
    public int capacity = 10;
    public int[] stack_contents = new int[capacity];
    public int stackPointer;

    /** initialize your data structure here. */
    public Min_Stack() {
        int[] stack_contents = new int[capacity];
        this.stackPointer = 0;
        this.stack_contents = stack_contents;
    }

    public void push(int x) {
        // if not exceeding size:
        if (this.stackPointer < this.capacity) {
            this.stack_contents[this.stackPointer] = x;
            this.stackPointer++;
        } else {
            System.out.println("Remove Elements to add additional items to stack");
        }
    }

    public void pop() {
        // removes last element of the array
        int lastElement = 0;
        this.stackPointer -= 1;
        lastElement = this.stack_contents[this.stackPointer];
        this.stack_contents[this.stackPointer] = 0;
        System.out.println("Popped " + lastElement + " from the stack");
    }

    public int top() {
        // check for size in try catch:
        return this.stack_contents[this.stackPointer - 1];
    }

    public int topWithException() throws Exception {
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
        int min = this.stack_contents[this.stackPointer - 1];
        if (this.stackPointer == 1) {
            min = this.stack_contents[0];
        } else {

            for (int i = 0; i < this.stackPointer; i++) {

                if (this.stack_contents[i] < min) {
                    min = this.stack_contents[i];
                }
            }
        }
        return min;
    }

    /**
     * Your MinStack object will be instantiated and called as such: MinStack obj =
     * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
     * = obj.getMin();
     */

    public static void main(String[] args) {
        System.out.println("Creating a Stack...");
        Min_Stack example_stack = new Min_Stack();

        // check contents of stack
        // try {
        // System.out.println(test_stack.topWithException());
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // add 23 to stack
        // System.out.println("Pushing 23 to stack");
        // test_stack.push(23);

        // confirm 23 at top
        // try {
        // System.out.println(test_stack.topWithException());
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // remove top element 23
        // test_stack.pop();

        // confirm stack empty
        // try {
        // System.out.println(test_stack.topWithException());
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // EXAMPLE CALLS
        // System.out.println("Examples from Leet-Code:");
        // System.out.println("=========================");

        // // adds -2
        // example_stack.push(-2);
        // // adds 0
        // example_stack.push(0);
        // // adds -3
        // example_stack.push(-3);
        // // returns -3
        // System.out.println(example_stack.getMin());
        // // removes -3
        // example_stack.pop();
        // // removes 0
        // System.out.println(example_stack.top());
        // // returns -2
        // System.out.println(example_stack.getMin());

        // System.out.println("Submission Test:");
        // System.out.println("=====================");
        // Min_Stack submissionStack = new Min_Stack();
        // submissionStack.push(2);
        // submissionStack.push(0);
        // submissionStack.push(3);
        // submissionStack.push(0);
        // System.out.println(submissionStack.getMin());
        // submissionStack.pop();
        // System.out.println(submissionStack.getMin());
        // submissionStack.pop();
        // System.out.println(submissionStack.getMin());
        // submissionStack.pop();
        // System.out.println(submissionStack.getMin());

        // System.out.println("Third Submission:");
        // System.out.println("=====================");
        // Min_Stack thirdSubmissionExample = new Min_Stack();
        // thirdSubmissionExample.push(1);
        // thirdSubmissionExample.push(2);
        // System.out.println(thirdSubmissionExample.top());
        // System.out.println(thirdSubmissionExample.getMin());
        // thirdSubmissionExample.pop();
        // System.out.println(thirdSubmissionExample.getMin());
        // System.out.println(thirdSubmissionExample.top());

        System.out.println("Leet Code Stack Trace Example");
        System.out.println("================================");
        Min_Stack leetExample = new Min_Stack();
        leetExample.push(85);
        leetExample.push(-99);
        leetExample.push(67);
        System.out.println("GetMin: " + leetExample.getMin());
    }
}
