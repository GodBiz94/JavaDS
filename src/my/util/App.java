package my.util;

import java.util.*;

public class App {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("E");
		
		myList.add(0, "a");
		myList.add(2, "b");
		
		
		
		
		for(String item : myList){
			System.out.println(item);
		}
		
		myList.get(3);
		myList.reverse();
	}

}
