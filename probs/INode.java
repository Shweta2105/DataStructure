package DataStructure.probs;

public interface INode<K> {
	
	int data = 0;
	INode next = null;
	public K getKey();
	public void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
	
	

}
