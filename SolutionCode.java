// Encryption of stringConsider the following text
//  "COVID crisis has taught us several lessons and together we will overcome this great challenge. 
//   Now there is a sense of introspection in people. 
//   India will emerge stronger from this.”
// Encrypt the above string based on the following rules:
// Convert the entire string into encrypted digits based on the alphabetical ordering.
// Ex:       a becomes 1, b becomes 2, c becomes 3, d becomes 4, etc.(lowercase)           
//           A becomes 27, B becomes 28, C becomes 29, etc.(uppercase). (full stop) will have the value 99.            
//           ‘space’ will have the value 0.
// Convert the text into a sequence of encrypted digits:
// Ex. COVID crisis will become  
//     29        41        48        35        30        3          18        9          19        9          19
// Once the entire text is converted into digits, do the following:
// Each encrypted digit of a 2 lettered word will be given an increment of 200
// Each encrypted digit of a 3 lettered word will be given an increment of 300, 
// 4 lettered word will get an increment of 400 and so on.           
// Ex. ‘has’ is a 3-lettered word. When encrypted will have a representation of 8 1 19           
// Since it is a 3-lettered word, it will be incremented by 300 and will become 308 301 319No increments for full stop 
// and spaceDisplay the above text as encrypted digits before the increment. Display the sum of all the digits.          
// Display the above text as encrypted digits after the increment. Display the sum of all the digits.
public class Main {

	public static void main(String[] args) {
		
		int temp = 0, count = 0, sumBeforeIncrement = 0, sumAfterIncrement = 0;
		
		int incrementArray[] = new int[50];
		
			    String sentence = "COVID crisis has taught us several lessons and"
			    		+ " together we will overcome this great challenge."
			    		+ " Now there is a sense of introspection in people."
			    		+ " India will emerge stronger from this.";
			    
			    char[] charArray = sentence.toCharArray();
			    
			    System.out.println("\n Encrypted String Before Incrementing including white spaces & fullstops : \n");
			    for (char output : charArray) {
			    	
			    	int ascii = output;
			    	if(ascii >= 65 && ascii <= 90) {
			    		
			    		temp = ascii - 38;
			    	}
			    	else if(ascii >= 97 && ascii <= 122) {
			    		
			    		temp = ascii - 96;
			    	}
			    	else if(ascii == 32) {
			    		
			    		temp = 0;
			    	}
			    	else if(ascii == 46) {
			    		
			    		temp = 99;
			    	}
			    	else {
			    		temp = 90;
			    	}
			    	
			    	sumBeforeIncrement = sumBeforeIncrement + temp;
			    	System.out.print(" "+temp+ "  ");
			    }
			    System.out.println("\n\n Sum of All the Digits before increment, including white spaces and fullstops are : "+sumBeforeIncrement);
		
			    System.out.println("\n\n Encrypted String After Incrementing including white spaces & fullstops : \n");

			    for (char outIncrement : charArray) {
			    	
			    	int ascii = outIncrement;
			    	if(ascii >= 65 && ascii <= 90) {
			    		
			    		temp = ascii - 38;
			    	}
			    	else if(ascii >= 97 && ascii <= 122) {
			    		
			    		temp = ascii - 96;
			    	}
			    	else if(ascii == 32) {
			    		
			    		temp = 0;
			    	}
			    	else if(ascii == 46) {
			    		
			    		temp = 99;
			    	}
			    	else {
			    		temp = 90;
			    	}
			    	
			    	if(temp != 0 && temp != 99) {
			    		
			    		incrementArray[count] = temp;
			    		count++;
			    	}
			    	else {
			    		if(temp == 0 || temp == 99) {
			    		for(int a = 0;a < count;a++) {
			    			
			    			
			    			System.out.print(" "+(incrementArray[a] + (count*100))+"  ");
			    			sumAfterIncrement = sumAfterIncrement + (incrementArray[a] + (count*100));
			    		}
			    		if(temp == 0) {
			    		System.out.print("0 ");
			    		count=0;
			    		}
			    		else if(temp == 99) {
			    			sumAfterIncrement = sumAfterIncrement + 99;

				    		System.out.print("99  ");
				    		count=0;
				    		}
			    		}
			    		
			    		
			    	}
			    	
			    }
			    System.out.println("\n\n Sum of All the Digits after increment, including white spaces and fullstops are : "+sumAfterIncrement);
	}

}
