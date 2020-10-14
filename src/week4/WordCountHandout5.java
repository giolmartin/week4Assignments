package week4;

import java.io.*;
import java.util.Scanner;

public class WordCountHandout5 {

	 private
	 static int count = 1;
	public static void main(String args[]) throws IOException {

		
		
			 File file = new File("lear.txt"); 
			

       
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
      
        int wordCount = 0; 
        int lineCount = 0; 
        int characterCount = 0; 
         
          
        while((line = reader.readLine()) != null) {  
                characterCount += line.length(); 
                  
                String[] wordList = line.split("\\W+" ); 
                  
                wordCount += wordList.length; 
              
               for (String instance :  wordList) {
            	 
            	   System.out.print("Word #: " + count+++ "    ");
            	   System.out.println(instance);
               }
                
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] linesList = line.split("\\n"); 
                  
                lineCount += linesList.length; 
            
        } 
          
        System.out.println("Total word count = " + wordCount); 
        System.out.println("Lines: " + lineCount); 
        System.out.println("Total number of characters = " + characterCount); 
       
        
	}
}

	
