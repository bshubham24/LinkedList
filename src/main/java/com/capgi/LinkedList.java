package com.capgi;

public class LinkedList {
	private INode head;
	private INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}

	}

	public void printLinkedList() {
		INode tempNode = this.head;
		while (tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
	}
}
