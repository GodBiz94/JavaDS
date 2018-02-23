package my.util;
import java.util.*;

public class LinkedList<E> implements Iterable<E> {
	
	private Node head;
	private Node tail;
	
	public void add(E data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			Node lastNode = head;
			while(lastNode.getNext() != null){
				lastNode = lastNode.next;
			}
			lastNode.setNext(newNode);
		}
	}
	
	public void add(int index, E data){
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(index == 0){
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node prev =null;
		Node current = head;
		
		int i =0;
		while(current !=null && i<index){
			prev = current;
			current = current.next;
			i++;
		}
		
		newNode.next = prev.next;
		prev.next = newNode;
		System.out.println(head);
		
	}
	
	public void get(int index){
		Node node = head;
		int i =0;
		
		while(node!=null)
		{
			if(i == index)
				System.out.println(node.data);
			i++;
			node = node.next;
		}
		}
			
		
	public void reverse(){
		
		Node node = head;
		
		Node prev = null;
		Node current = node;
		while(current != null){
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		head = prev;
		System.out.println(head);
		
	}
	
	@Override
	public Iterator<E> iterator(){
		return new Iterator<E>(){
			Node temp = head;
			@Override
			public boolean hasNext(){
				if(temp != null)
				return true;
				else
					return false;
			}
			
			@Override
			public E next(){
				E data = temp.getData();
				temp = temp.getNext();
				return data;
			}
		};
	}
	
	private class Node{
		E data;
		Node next;
		
		public Node(E data){
			this.data = data;
		}
		
		public Node(E data, LinkedList<E>.Node next){
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}

}
