// Problem: https://leetcode.com/problems/min-stack/

// Solution:
public class Min_Stack {

    /** initialize your data structure here. */
    public Min_Stack() {
        // create generic arraylist object
        // set capacity to 10
        int capacity = 10;

    }

    public void push(int x) {
        // if not exceeding size:
        if (Min_Stack.length() < Min_Stack.capacity) {

        } else {
            // increase capacity of stack
            Min_Stack.capacity += 10;
            // re-attempt pushing
            Min_Stack.push(this.x);
        }
    }

    public void pop() {
        // removes last element of the array
        this.Min_Stack.pop();
    }

    public int top() {
        // check for size in try catch:

        if (this.Min_Stack.length() != 0) {
            // return the last element
            return this.Min_Stack[this.Min_Stack.length()];
        }
    }

    public int getMin() {
        if (this.Min_Stack.length() != 0) {
            // return the smallest element

        }
    }

    /**
     * Your MinStack object will be instantiated and called as such: MinStack obj =
     * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
     * = obj.getMin();
     */
}
