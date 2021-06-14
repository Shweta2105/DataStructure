package DataStructure.probs;

import org.junit.Test;

import junit.framework.Assert;

public class Queuemain {
	@Test
	public void insertValueInQueue() {
		System.out.println("Appending element to bottom");
		MyNode<Integer> MyFirstnode = new MyNode<>( 56);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 70);
		Queuelist myQueue = new Queuelist();
		myQueue.append(MyFirstnode); //calling append function
		myQueue.append(MySecondnode);
		myQueue.append(MyThirdnode);
		myQueue.printMyNodes();
		Assert.assertNotNull(myQueue);
	}
	
	@Test
	public void deQueue() {
		System.out.println("Dequueing element to from top");
		MyNode<Integer> MyFirstnode = new MyNode<>( 56);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 70);
		Queuelist myQueue = new Queuelist();
		myQueue.append(MyFirstnode); //calling append function
		myQueue.append(MySecondnode);
		myQueue.append(MyThirdnode);
		myQueue.printMyNodes();
		myQueue.delete();
		myQueue.printMyNodes();
		
		Assert.assertNotNull(myQueue);
	}
	

}
