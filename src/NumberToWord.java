import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;



public class NumberToWord {

	public static void main(String[] args) throws IOException {
		String sCurrentLine;
		
		
		Scanner in = new Scanner(System.in); 
		String[] compatablNnumbers = new String[10];

		
		/*System.out.println("Enter your phone number.");
		int myNumber = in.nextInt();*/
		
		int[] myNumber = new int[20];
		myNumber = numberAlgoTwo.numberRenditions();
		
		
		for(int z = 0; z < myNumber.length; z++){
			int stringToInt;
			
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\spencer\\Documents\\Programmming\\Android7.5\\Dictionary_Converter\\dicRes\\FORMATTEDwordsdowithnumbers.txt"));
		
		
			//System.out.println(br.readLine().substring(11));
			
			
			for (int i = 0; (sCurrentLine = br.readLine()) != null;) {
				
				
		
				stringToInt = Integer.parseInt(sCurrentLine.substring(11));
						
				if(myNumber[z] == stringToInt){
					compatablNnumbers[i] = sCurrentLine;
					System.out.println(sCurrentLine);
					i++;
				}
			
		
			}
		
	
		
		br.close();
		}
		System.out.println("fin");

	}
}
