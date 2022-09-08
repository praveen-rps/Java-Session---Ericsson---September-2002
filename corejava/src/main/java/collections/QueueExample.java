package collections;

import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue pq = new PriorityQueue();
		ArrayDeque dq = new ArrayDeque();
		pq.add(10);
		pq.add(1);
		pq.add(12);
		pq.add(4);
		pq.remove();
		System.out.println(pq);
		
		dq.add("India");
		dq.add("China");
		dq.add("Japan");
		
		System.out.println(dq);
		dq.addFirst("America");
		System.out.println(dq);
		dq.addLast("Zimbabawe");
		System.out.println(dq);
		//dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);

	}

}
