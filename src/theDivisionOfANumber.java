
public class theDivisionOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int phoneNumber = 6646127;
		
		/*System.out.println(phoneNumber % 1000000); //displays 646127
		
		System.out.println(phoneNumber / 10); // displays 664612
*/		
		int numberOfWays = 11;
		
		for(int z = 10; (phoneNumber / z) > 9; z *= 10){			
			System.out.println(phoneNumber / z);
			numberOfWays ++;
		}
		
		System.out.println();
		for(int z = 1000000; (phoneNumber % z) > 9; z /= 10){			
			System.out.println(phoneNumber % z);	
			numberOfWays ++;
		}
		
		/*
		for(int i = 1000000; i > 1000; i /= 10){
			
			for(int z = 10; z != ){
				
			}
			
		}*/
		
		
		
		System.out.println((phoneNumber % 1000000) / 10 + "4digitway"); // another way
		System.out.println((phoneNumber % 1000000) / 100  + "4digitway");
		System.out.println((phoneNumber % 1000000) / 1000 + " 3digit way");
		System.out.println((phoneNumber % 1000000) / 10000 + " 2digit way");
		System.out.println();
	
		System.out.println((phoneNumber % 100000) / 10 + "4digitway");
		System.out.println((phoneNumber % 100000) / 100 + " 3digit way");
		System.out.println((phoneNumber % 100000) / 1000 + " 2digit way");


		System.out.println((phoneNumber % 10000) / 10 + " 3digit way");
		System.out.println((phoneNumber % 10000) / 100 + " 2digit way");
		
		System.out.println((phoneNumber % 1000) / 10 + " 2digit way");


		
		
		System.out.println("\n\nNumber of Ways " + numberOfWays);
		System.out.println("fin");
	}

}
