package com.capgi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void givenThreeNumbersShouldPassLinkedListTest() {
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(70);
		Node<Integer> thirdNode = new Node<Integer>(80);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);

		assertTrue(result);
	}
}
