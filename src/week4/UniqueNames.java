package week4;

import java.util.*;
import java.util.function.Predicate;

public class UniqueNames  {

	private static Scanner input = new Scanner(System.in);
	private static int c = 0;

	public  static void main (String args[]) {

		ArrayList<String> list = new ArrayList<String>();

		readList(list);
		uniqueNames(list);


	}

	private static void readList(ArrayList list) {
		while(true) {
			System.out.print("Enter name: ");
			String item = input.nextLine();
			if(item.equals("")) break;
			list.add(item);
		}
	}

	private static void uniqueNames(ArrayList list) {

		int count = 0;

		Iterator<String> it = list.iterator();
		while(it.hasNext()) 
		{
			for (int i = 0; i < list.size() ; i++) 
			{
				String test = (String) list.get(i);
				for(int j = i +1 ; j < list.size() ; j++) 
				{
					if(test.equals(list.get(j)))
					{

						list.remove(j);
					}

				}

			}
			count++;
			if (count == 10)break;

		}


		printArray(list);

	}	
	private static void printArray(ArrayList list) {
		System.out.println("Unique Name list contains: ");
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
