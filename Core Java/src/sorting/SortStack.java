package sorting;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1); st.push(5); st.push(-5); st.push(10); st.push(2);
		System.out.println(st);
		sortStack(st);
		System.out.println(st);
	}

	private static void sortStack(Stack st) {
			if(!st.empty()){
				int temp = (int)st.pop();
				sortStack(st);
				sortCompare(st, temp);
			}
	}

	private static void sortCompare(Stack st, int element) {
			if(st.isEmpty() || element >(int)st.peek()){
				st.push(element);
			}
			else{
				int temp = (int)st.pop();
				sortCompare(st, element);
				st.push(temp);
			}
	}

}
