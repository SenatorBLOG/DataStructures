package advancedList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		PriorityQueue<Student2> pQueue4 = new PriorityQueue<>();
		
		Student2 s12 = new Student2("Mike", 3.4, 21);
		Student2 s23 = new Student2("John", 3.2, 20);
		Student2 s34 = new Student2("Marelin", 3.8, 19);
		
		pQueue4.offer(s12);
		pQueue4.offer(s23);
		pQueue4.offer(s34);
		
		System.out.println(pQueue4.poll());
		System.out.println(pQueue4.poll());
		System.out.println(pQueue4.poll());
		
		PriorityQueue<Student> pQueue3 = new PriorityQueue<>(new StudentComparator());
		
		Student s1 = new Student("Mike", 3.4, 21);
		Student s2 = new Student("John", 3.2, 20);
		Student s3 = new Student("Marelin", 3.8, 19);
		
		pQueue3.offer(s1);
		pQueue3.offer(s2);
		pQueue3.offer(s3);
		
		System.out.println(pQueue3.poll());
		System.out.println(pQueue3.poll());
		System.out.println(pQueue3.poll());
		
		
		PriorityQueue<Integer> pQueue2 = new PriorityQueue<>(Comparator.reverseOrder());
		
		pQueue2.offer(1);
		pQueue2.offer(2);
		pQueue2.offer(6);
		pQueue2.offer(4);
		
		System.out.println(pQueue2.poll());
		System.out.println(pQueue2.poll());
		System.out.println(pQueue2.poll());
		System.out.println(pQueue2.poll());
		
		
		PriorityQueue<String> pQueue1 = new PriorityQueue<>();

		pQueue1.offer("March");
		pQueue1.offer("June");
		pQueue1.offer("July");
		pQueue1.offer("September");
		
		System.out.println(pQueue1.poll());
		System.out.println(pQueue1.poll());
		System.out.println(pQueue1.poll());
		System.out.println(pQueue1.poll());
		
		Queue<String> queue1 = new LinkedList<>();
		
		queue1.offer("Camel");
		queue1.offer("Bond");
		queue1.offer("Marlboro");
		
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		
		
		
		
		Stack<String> stack1 = new Stack<>();
		
		stack1.push("Red");
		stack1.push("Green");
		stack1.push("Blue");
		stack1.push("Black");
		
		System.out.println(stack1.search("Red"));
		
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.empty());
		

	}

}
