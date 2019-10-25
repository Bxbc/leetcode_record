package leetcode;


import java.util.ArrayList;
import java.util.Arrays;

class min_stack {
    /** initialize your data structure here. */
    private int depth = 0;
    private int[] minstack;
    private int min;
    private int size;
    private int[] temp;
    public min_stack() {
        size = 100;
        minstack = new int[size];
    }

    public void push(int x) {
        if(depth>=size){
            size += size;
            minstack = Arrays.copyOf(minstack,size);
        }
        minstack[depth] = x;
        depth++;
    }

    public void pop() {
        if(depth!=0){
            depth--;
        }
    }

    public int top() {
        if(depth==0) return 0;
        return minstack[depth-1];
    }

    public int getMin() {
        if(depth==0) return 0;
        min = Integer.MAX_VALUE;
        for(int i=0;i<depth;i++){
            if(minstack[i]<min){
                min = minstack[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */