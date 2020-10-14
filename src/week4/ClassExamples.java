package week4;

import java.util.*;

public class ClassExamples {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		readList(list);
		printArray(list);
		
	}
	private static void readList(ArrayList list) {
		while(true) {
			String item = input.nextLine();
			if(item.equals(""))break; 
			list.add(item);
		}
	}
	private static void printArray(ArrayList list) {
		System.out.println("List contains " + list.size() + " elements.");
		for (int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
