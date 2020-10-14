package week4;

import java.io.*;

public class Histograms {
	private static String[] arrayScores = new String[60];
	private static int counter = 0;
	
	public static void main(String args[]) throws IOException {
		
		File file = new File("MidtermScores.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String scoresAmount ;
		String[] trans;
		while((scoresAmount = reader.readLine()) != null) {
			trans = scoresAmount.split("\\W+");
			arrayScores[counter++] = trans[0];
			//System.out.println(counter);
			//System.out.println(arr.length);
			
			
		}
		
		String[] scoreCounter = new String[11];
		int[] scores = new int[counter];
		
		
		
		for (int i = 0; i < scoreCounter.length; i++) { //initialize
			scoreCounter[i] = "";
		}
		
		//Copies and transforms String to integers from arr to scores to be able to manipulate them. 
		for(int i = 0; i < counter; i++) {
			scores[i] = Integer.parseInt(arrayScores[i]);
		}
		
		//for(int i: scores) {
		//	System.out.println("Student score: " + i);
		//}
		
		
		for(int c : scores) {
			if (c >= 0 && c <= 9) { //00-09
				scoreCounter[0]+="*";
			} else  if (c >= 10 && c <= 19){
				scoreCounter[1]+="*";
					} else if(c >= 20 && c <= 29) {
						scoreCounter[2]+="*";
						} else if (c >= 30 && c <= 39) {
							scoreCounter[3]+="*";
						} else if (c >= 40 && c <= 49) {
							scoreCounter[4]+="*";
						} else if (c >= 50 && c <= 59) {
							scoreCounter[5]+="*";
						} else if (c >= 60 && c <=69) {
							scoreCounter[6]+="*";
						} else if (c >= 70 && c <= 79) {
							scoreCounter[7]+="*";
						} else if (c >= 80 && c <= 89) {
							scoreCounter[8]+="*";
						} else if (c >= 90 && c <= 99) {
							scoreCounter[9]+="*";
						} else if (c == 100) {
							scoreCounter[10]+="*";}
		}
		
		System.out.println("00-09: " + scoreCounter[0]);
		System.out.println("10-19: " + scoreCounter[1]);
		System.out.println("20-29: " + scoreCounter[2]);
		System.out.println("30-39: " + scoreCounter[3]);
		System.out.println("40-49: " + scoreCounter[4]);
		System.out.println("50-09: " + scoreCounter[5]);
		System.out.println("60-09: " + scoreCounter[6]);
		System.out.println("70-09: " + scoreCounter[7]);
		System.out.println("80-89: " + scoreCounter[8]);
		System.out.println("90-09: " + scoreCounter[9]);
		System.out.println("  100: " + scoreCounter[10]);
		
		
	}
}
