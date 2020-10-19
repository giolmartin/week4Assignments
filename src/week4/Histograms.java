package week4;

import java.io.*;

public class Histograms {
	private static String[] arrayScores = new String[51];
	private static int counter = 0;
	private static final String[] SCORE_COUNTER = new String[11];
	
	public static void main(String args[]) throws IOException {
		String scoresAmount ;
		String[] trans;
		
		int[] scores = new int[51];
		
		File file = new File("MidtermScores.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		
		while((scoresAmount = reader.readLine()) != null) 
		{
			trans = scoresAmount.split("\\W+");
			arrayScores[counter++] = trans[0];
		}
		for (int i = 0; i < SCORE_COUNTER.length; i++) 
		{ //initialize
			SCORE_COUNTER[i] = "";
		}
		

		for(int i = 0; i < counter ; i++) 
		{
			scores[i] = Integer.parseInt(arrayScores[i]);
		}
		for(int c : scores)
		{
			if (c >= 0 && c <= 9) { 
				SCORE_COUNTER[0]+="*";
			} else  if (c >= 10 && c <= 19){
				SCORE_COUNTER[1]+="*";
					} else if(c >= 20 && c <= 29) {
						SCORE_COUNTER[2]+="*";
						} else if (c >= 30 && c <= 39) {
							SCORE_COUNTER[3]+="*";
						} else if (c >= 40 && c <= 49) {
							SCORE_COUNTER[4]+="*";
						} else if (c >= 50 && c <= 59) {
							SCORE_COUNTER[5]+="*";
						} else if (c >= 60 && c <=69) {
							SCORE_COUNTER[6]+="*";
						} else if (c >= 70 && c <= 79) {
							SCORE_COUNTER[7]+="*";
						} else if (c >= 80 && c <= 89) {
							SCORE_COUNTER[8]+="*";
						} else if (c >= 90 && c <= 99) {
							SCORE_COUNTER[9]+="*";
						} else if (c == 100) {
							SCORE_COUNTER[10]+="*";}
		}
		
		System.out.println("00-09: " + SCORE_COUNTER[0]);
		System.out.println("10-19: " + SCORE_COUNTER[1]);
		System.out.println("20-29: " + SCORE_COUNTER[2]);
		System.out.println("30-39: " + SCORE_COUNTER[3]);
		System.out.println("40-49: " + SCORE_COUNTER[4]);
		System.out.println("50-09: " + SCORE_COUNTER[5]);
		System.out.println("60-09: " + SCORE_COUNTER[6]);
		System.out.println("70-09: " + SCORE_COUNTER[7]);
		System.out.println("80-89: " + SCORE_COUNTER[8]);
		System.out.println("90-09: " + SCORE_COUNTER[9]);
		System.out.println("  100: " + SCORE_COUNTER[10]);
		
		
	}
}
