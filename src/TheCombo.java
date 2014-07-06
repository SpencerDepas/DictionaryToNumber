/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TheCombo {

		public static void main(String[] args) throws IOException {
			String sCurrentLine;
			StringBuilder st = new StringBuilder();
			File logFile;
			String zMan = "zekeisabadass";
			String newZman = "";
			
			
			char cChar = 'c';

			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\spencer\\Desktop\\Temp Text Files\\wordsdic.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				st.append(sCurrentLine);
				//System.out.println(sCurrentLine);

				//longest word is 8 char long
				if(sCurrentLine.length() > longestWord){
					longestWord = sCurrentLine.length();
				}
				int longestWord = 11;
				
				BufferedWriter writer = null;
				try {
					// create a temporary file
					String numberTxt = "FORMATTEDwordsdowithnumbers.txt";
					logFile = new File(numberTxt);

					
					// This will output the full path where the file will be written to...
					System.out.println(logFile.getCanonicalPath());

					
					
						writer = new BufferedWriter(new FileWriter(logFile, true));
						
						
						for(int i = 0; i < sCurrentLine.length(); i ++){
							
							
							cChar = sCurrentLine.charAt(i);
							
						

							if ((cChar == 'a') || (cChar ==  'b') || (cChar == 'c' )){
								cChar = '2';
							}else if ((cChar == 'd') || (cChar ==  'e') || (cChar == 'f' )){
								cChar = '3';
							}else if ((cChar == 'g') || (cChar ==  'h') || (cChar == 'i' )){
								cChar = '4';
							}else if ((cChar == 'j') || (cChar ==  'k') || (cChar == 'l' )){
								cChar = '5';
							}else if ((cChar == 'm') || (cChar ==  'n') || (cChar == 'o' )){
								cChar = '6';
							}else if ((cChar == 'p') || (cChar ==  'q') || (cChar == 'r' ) || (cChar == 's' )){
								cChar = '7';
							}else if ((cChar == 't') || (cChar ==  'u') || (cChar == 'v' )){
								cChar = '8';
							}else if ((cChar == 'w') || (cChar ==  'x') || (cChar == 'y' ) || (cChar == 'z' )){
								cChar = '9';
							}
							
							
							newZman += cChar;
							
						}
						//to make the txt formatted 
						longestWord -= sCurrentLine.length();
						
						
						
						writer.append(sCurrentLine);
						for(int i = 0; i < longestWord; i ++){
							writer.append(" ");
						}
						writer.append(newZman);
						writer.newLine();
						
						newZman = "";
						
							
						
						
						
						

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						// Close the writer regardless of what happens...
						writer.close();
					} catch (Exception e) {
					}

				}

			}
			
			br.close();
			//System.out.println(longestWord);
		}
		
		
			
		
		
	}
*/