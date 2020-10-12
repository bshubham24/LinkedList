package com.capgi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void givenThreeNumbersWhenAddedT0LinkedListShouldGetAddedInBack() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(thirdNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(firstNode);
		assertTrue(result);
	}

	@Test
	public void givenThreeNumbersWhenAddedT0LinkedListShouldGetAddedToLast() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}
}
