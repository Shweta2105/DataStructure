package DataStructure.probs;

public class MyLinkedList<K> {
	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;

	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode temp = this.head;
			this.head = newNode;
			this.head.setNext(temp);
		}

	}

	public void append(INode newnode) {
		if (this.head == null) {
			this.head = newnode;
		}
		if (this.tail == null) {
			this.tail = newnode;
		} else {
			this.tail.setNext(newnode);
			this.tail = newnode;
		}
	}

	public void printMyNodes() {
		StringBuffer mynodes = new StringBuffer("My nodes: ");
		INode temp = head;
		while (temp.getNext() != null) {
			mynodes.append(temp.getKey());
			if (!temp.equals(tail))
				mynodes.append("->");
			temp = temp.getNext();
		}
		mynodes.append(temp.getKey());
		System.out.println(mynodes);
	}

	public void insert(INode mynode, INode newnode) {
		INode temp = mynode.getNext();
		mynode.setNext(newnode);
		newnode.setNext(temp);

	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;

	}

	public void delete() {
		if (this.head != null) {

			// 1. if head in not null and next of head
			if (this.head.getNext() == null) {
				this.head = null;
			} else {

				// 2. Else, traverse to the second last
				// element of the list
				INode temp;
				temp = this.head;
				while (temp.getNext().getNext() != null)
					temp = temp.getNext();

				// 3. Change the next of the second
				// last node to null and delete the
				// last node
				INode lastNode = temp.getNext();
				temp.setNext(null);
				lastNode = null;
			}
		}
	}

	public void deleteNode(int data) {
		// Store head node
		INode temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == data) {

			head = temp.next; // Changed head
		}
		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && INode.data != data) {
			prev = temp;
			temp = temp.next;
		}
		// If key was not present in linked list
		if (temp != null) {
			prev =temp.next;
		}
		if (temp == null) {
			System.out.println(data + " not found");

		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		MyNode new_node = new MyNode(new_data);
		new_node.next = head;
		head = new_node;
	}

	public boolean search(K i) {
		if (head == null) {
			return false;
		}

		INode<K> Node = head;
		while (Node != null) {
			if (Node.getKey() == i) {
				return true;
			}
			Node = Node.getNext();
		}
		return false;

	}

	// Find length of linked list using iterative method
	public int lengthOfLinkedList() {
		INode temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}

}
