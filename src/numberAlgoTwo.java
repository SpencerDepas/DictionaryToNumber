
public class numberAlgoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNumber = 6646127;
		int totalNumberCombos = 1;
		
		
		String sNumber = Integer.toString(myNumber);
		int numberLength = sNumber.length(); // for end of index ect
		int blockSize = sNumber.length() -1; //this is what the index moves
		// for loop index
		/*System.out.println(blockSize);
		System.out.println(numberLength);
		System.out.println(((numberLength - blockSize) + 1 ));*/
		
		
		for(int i = blockSize; i > 1; i--){
			
			for(int z = 0, t = i; z != ((numberLength - i) + 1 ); z++, t ++ ){ // for index
				
				/*System.out.println("I am  z " + z);
				System.out.println("I am  blockSize " + blockSize);
				System.out.println("I am  (numberLength - blockSize) + 1 ) " + (numberLength - blockSize) + 1 );*/

				
				System.out.println(sNumber.substring(z, t));
				totalNumberCombos ++;
			}
			
			
		}
		
		
		System.out.println("fin    " + totalNumberCombos);
	}

}
