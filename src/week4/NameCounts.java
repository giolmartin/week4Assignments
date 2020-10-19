package week4;

import java.util.*;

public class NameCounts {

	private static Scanner input = new Scanner(System.in);
	private static HashMap<String,Integer> listN = new HashMap<String,Integer>();

	public static void main (String args[]) 
	{
		
		readNames(listN);
		displayNames(listN);
	}

	private static void readNames(Map<String,Integer> list)
	{
		Integer counter  = 0;
		while(true) 
		{
			System.out.print("Enter name: ");
			String name = input.nextLine();
			if(name.equals("")) break;
			counter =list.get(name);
			if(counter == null) 
			{
				counter = new Integer(1);
			} else {
				counter++;
			}

			listN.put(name, counter);
		}
	}

	private static void displayNames(Map<String, Integer> list)
	{
		Iterator<String> it = list.keySet().iterator();
		
		while(it.hasNext()) 
		{
			String name = it.next();
			Integer counter = list.get(name);
			System.out.println(name + ": " + counter );

		}
	}

}
