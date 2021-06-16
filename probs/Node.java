package DataStructure.probs;

public class Node<K> implements INode<K> {
	K data;
	Node left;
	Node right;
	
	public Node(K data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub

	}

	@Override
	public INode getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNext(INode next) {
		// TODO Auto-generated method stub

	}

}
