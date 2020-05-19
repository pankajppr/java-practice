package beginner;
//Using the Stack created
public class StackApp {
	public static void main(String[] args) {
	Stack stack = new Stack(10);
	stack.push(11);
    stack.push(21);
    stack.push(31);
    stack.push(41);
    stack.push(51);

    System.out.print("Popped items: ");
    System.out.print(stack.pop()+" ");
    System.out.print(stack.pop()+" ");
    System.out.print(stack.pop()+" ");
    System.out.print(stack.pop()+" ");
    System.out.print(stack.pop()+" ");

	}

}
class Stack {
	private int size;
	private int[] stack_arr;
	private int top;
	// Stack Constructors
	Stack(){
		super();
	}
	Stack(int size){
		this.size=size;
		stack_arr = new int[size];
		top = -1;
	}
	// Push And Pop Operation
	public void push(int val){
		if(isFull()){
			throw new StackFullException("Cannot Push "+val+". Stack is Full");
		}
		stack_arr[++top] = val;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new StackEmptyException("Stack is Empty");
		}
		return stack_arr[top--];
	}
	//Check of Full or Empty
	boolean isFull(){
		return(top == size-1);
	}
	boolean isEmpty(){
		return(top == -1);
	}
}

// Exception Classes
class StackFullException extends RuntimeException{
	public StackFullException(){
		super();
	}
	StackFullException(String message){
		super(message);
	}
}

class StackEmptyException extends RuntimeException{
	public StackEmptyException(){
		super();
	}
	public StackEmptyException(String message){
		super(message);
	}
}
