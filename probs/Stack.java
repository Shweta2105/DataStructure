package DataStructure.probs;

public class Stack {
	
	
	private int top = -1;
	private int stk[];

	public boolean push(int mynode) {
		if(isFull()) {
			System.out.println("Stack overflow");
		} else {
			stk[++top] = mynode;
			
		}
		return true;
		
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return this.top >= stk.length -1;
	}

	public int peak() {
		
		if(isEmpty()) {
			System.out.println("Stack is underflow");
		}
		System.out.println("top"+stk[top]);
		return top;
		
	}

	private boolean isEmpty() {
		
		return this.top<0;
	}

	public void printStack() {
		System.out.println("Elements of stack are: \n");
		if(isEmpty()) {
			System.out.println("Stack is underflow");
		}
		for(int i=0; i<=this.top; i++) {
			System.out.println(stk[i]+' ');
		}
		
	}

	

}
