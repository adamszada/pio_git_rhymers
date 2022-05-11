package edu.kis.vh.nursery.list;

/**
 *  protected Node prev - previous list's node
 *  protected Node next - next list's node
 *	private final int value - value of node
 *	public Node(int i) - constructor to initialize Node
 *  public int getValue(), 	public Node getPrev(), public void setPrev(Node prev), public void setNext(Node next)... - methods to access and update the value
 */


public class Node {

	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
