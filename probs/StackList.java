package DataStructure.probs;

import org.junit.Test;

import junit.framework.Assert;

public class StackList {
	@Test
	public void push3NUmbersOnToStack() {
		Stack myStack = new Stack();
		int MyFirstnode = 70;
		int MySecondnode = 30;
		int MyThirdnode = 56;
		myStack.push(MyFirstnode);
		myStack.push(MySecondnode);
		myStack.push(MyThirdnode);
		int mynode =myStack.peak();
		myStack.printStack();
		Assert.assertEquals(MyThirdnode, mynode);
		
	}
	public void pop3NUmbersOnToStack() {
		Stack myStack = new Stack();
		int MyFirstnode = 70;
		int MySecondnode = 30;
		int MyThirdnode = 56;
		myStack.push(MyFirstnode);
		myStack.push(MySecondnode);
		myStack.push(MyThirdnode);
		int mynode =myStack.peak();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		Assert.assertNull(null);
	}

}
