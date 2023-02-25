// Level 1
//Auto generate and fill an array of 100 integers with 3 digit random numbers . Display the numbers. 
//Level 2 
//Given that { a[k],a[k+1] } represent a pair,display all such pairs of numbers where a[k] - a[k+1] is prime numbers.  
//Display the count of such pairs  
//Level 3 
//Display the sub array within the array , where a[k],a[k+1],a[k+2],a[k+3],a[k+4]........a[k+n] are in the ascending order.        

public class Main {

	public static void main(String[] args) {
		
		int minimum = 100, maximum = 999, next = 1, count = 0;
		int array[] = new int[100];
		int arr[] = new int[100];
		
		// Level 1
		int range = (maximum - minimum)+1;
		System.out.println(" Level 1 Generate 100 Random Numbers of Three Digit : \n");
		for(int a = 0; a < 100; a++) {
			
			array[a] = (int)(Math.random()*range)+ minimum;
			System.out.print(" "+array[a]+"  ");
			
			if(next%20 == 0)
				System.out.println("\n");
			next++;
		}
		// Level 2
		System.out.println(" The Pairs of difference is a prime number are : \n");
		next = 1;
		for(int b = 0; b < 99; b++) {
			int test = 0;
			int number1 = array[b];
			int number2 = array[b+1];
			int checkPrime = 0;
			if (number1 > number2) {
				 checkPrime = number1 - number2;
			}
			else if(number1 < number2) {
				 checkPrime = number2 - number1;
			}
			
			for(int c = 2; c < checkPrime/2; c++) {
				
				for(int d = 2; d < c ; d++) {
					
					if (checkPrime % d == 0) {
						test = 1 ;
						break;
					}
				}
				if(test == 1) {
					break;
				}
				
			}
			if(test == 0) {
				System.out.print(" ( "+ number1+" , "+ number2+" )  ");
				count++;
				if(next%5 == 0) {
					System.out.println("\n");
				}
				next++;
			}
	
		}
		System.out.println("\n\n The Count of Pairs of difference is a prime number is :  "+count +"\n");
		
		// Level 3
		count = 0;
		int cnt = 0;
		System.out.println(" The Consicutive numbers which keeps Acsending Order in nature are : \n");
		for(int e = 0; e < 99; e++) {
			
			if(array[e] < array[e+1]) {
				arr[cnt] = array[e];
				cnt++;
				count++;
			}
			else {
				if(count > 1) {
					System.out.print(" {");
					for(int f = 0; f < count-1; f++) {
						if(arr[f] < arr[f+1]) {
						System.out.print(" "+arr[f]+ "  ");
						}
					}
					System.out.println("}\n");
					cnt = 0;
					count = 0;
				}
					
			}
	
		}
		
		count = 0;
		 cnt = 0;
		System.out.println("\n The Consicutive numbers which keeps Decending Order in nature are : \n");
		for(int e = 0; e < 99; e++) {
			
			if(array[e] > array[e+1]) {
				arr[cnt] = array[e];
				cnt++;
				count++;
			}
			else {
				if(count > 1) {
					System.out.print(" {");
					for(int f = 0; f < count; f++) {
						if(arr[f] > arr[f+1]) {
							System.out.print(" "+arr[f]+ "  ");
							}					}
					System.out.println("}\n");
					cnt = 0;
					count = 0;
				}
					
			}
	
		}
	}

}
