package com.capgi;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void WhenGivenThreeNumbersShouldPassLinkedListTest() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void givenThreeNumbersWhenAddedT0LinkedListShouldGetAddedInFront() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		LinkedList<Integer> linkedList = new LinkedList<>();
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
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void givenThreeNumbersWhenInsertingSecondShouldPassLinkedListTest() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(thirdNode);
		linkedList.insertInBetweenTwoNumbers(firstNode, thirdNode, secondNode);
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void givenThreeNumbersWhenPopShouldDeleteFirstNode() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printLinkedList();
		linkedList.pop();
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(secondNode) && linkedList.getHead().getNext().equals(thirdNode)
				&& linkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void givenThreeNumbersWhenPopShouldDeleteLastNode() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printLinkedList();
		linkedList.popLast();
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(secondNode);
		assertTrue(result);
	}

	@Test
	public void whenGivenAKeySearchLinkedListAndReturnThatNode() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printLinkedList();
		Assert.assertEquals(secondNode, linkedList.searchNode(30));
	}

	@Test
	public void whenGivenAValueSearchThatNodeInTheListAndInsertNewNode() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Node<Integer> fourthNode = new Node<Integer>(40);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.InsertAfterANode(30, fourthNode);
		linkedList.printLinkedList();
		boolean result = secondNode.getNext().equals(fourthNode) && fourthNode.getNext().equals(thirdNode);
		assertTrue(result);
	}
}
