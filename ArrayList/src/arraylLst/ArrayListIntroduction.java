package arraylLst;

import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> strLinkedList = new LinkedList<>();
		
		strLinkedList.add("Red");
		strLinkedList.add("Green");
		strLinkedList.add("Blue");
		
		strLinkedList.forEach(System.out::println);
		
		strLinkedList.forEach(str -> System.out.println(str + "colours"));
		
		MyArrayList<String> strArrList2 = new MyArrayList<>();
		
		strArrList2.add("Red");
		strArrList2.add("Green");
		strArrList2.add("Blue");
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		
		
		for(int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i+1 + " element: " + intArrayList.get(i));
		}
		
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Canada");
		strArrayList.add("USA");
		strArrayList.add("China");
		
		
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(i+1 + " element: " + strArrayList.get(i));
		}
		strArrayList.add(1,"Brazil");
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(i+1 + " element: " + strArrayList.get(i));
		}
		strArrayList.remove(2);
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(i+1 + " element: " + strArrayList.get(i));
		}
	}

}
