// Sorting

	// base condition ---> if stack.size <= 1 return stack
	// hypothesis     ---> stack of size(n-1) is sorted
	// induction      ---> insert in sorted stack

// Inserting
	// base condition ---> if stack.size == 0 || stack.top <= value to be inserted 
	//						than insert in stack and return
	// hypothesis     ---> pop top insert in (n-1)
	// induction      ---> push previously poped value



package Recursion;

import java.util.Stack;

public class SortStack {
	
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		int arr[] = {1,0,8,5,3,7,2,4,9,6};
		for(int i : arr) st.push(i);
		System.out.println(st);
		sortStack(st);
		System.out.println(st);
	}
	
	static void sortStack(Stack<Integer> stack) {
		if(stack.size() <= 1) return;
		else {
			int val = stack.pop();
			sortStack(stack);
			insert(stack, val);
		}
	}
	
	static void insert(Stack<Integer> stack, int val) {
		if(stack.size() == 0 || stack.peek() <= val) {
			stack.push(val);
		} else {
			int temp = stack.pop();
			insert(stack, val);
			stack.push(temp);
		}
	}
	
}
