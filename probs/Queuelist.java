package DataStructure.probs;

public class Queuelist {
	MyLinkedList mylist = new MyLinkedList();

	public Queuelist() {
		this.mylist=mylist;
		
	}

	public void append(INode mynode) {
		mylist.append(mynode);
		
	}

	public void printMyNodes() {
		mylist.printMyNodes();
		
	}

	public void delete() {
		mylist.pop();
		
	}
	
	

}
