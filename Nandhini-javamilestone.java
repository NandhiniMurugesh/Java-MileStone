import java.util.*;
public class LinkedListReverse{
	public static void main(String args[]){
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		linklist.add(1);
		linklist.add(2);
		linklist.add(3);
		linklist.add(4);
		linklist.add(5);
		System.out.println(linklist);
			LinkedList<Integer> revlist = new LinkedList <Integer>();
				Collections.reverse(linklist);
		System.out.println(linklist);
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		
		System.out.println(llist);
			LinkedList<Integer> revllist = new LinkedList <Integer>();
				Collections.reverse(llist);
		System.out.println(llist);


			
	}
}
	