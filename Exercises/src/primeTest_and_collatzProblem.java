
public class primeTest_and_collatzProblem {
		
		static int threshold=200;

	public static void main(String[] args) {
	
		prime(threshold);
		System.out.println();
		System.out.println();
		collatz(threshold);
	
	}

	public static void prime(int threshold){
	
		for(int n = 3; n <=threshold; n++){
		
			if(isPrime(n))
		
				System.out.println(n);
		}
	}

	private static boolean isPrime(int n){
	
		boolean prime=true;
		int i = 2;

	  
		if (n == 1) {
			prime=false;
		}
		else{
			while (i <= n-1 && prime == true) {
				if (n%i==0) {
					prime=false;
				}
				i=i+1;
			}
		}
		return prime;
	}
	
	public static void collatz(int threshold){
		for( int i =1; i<=threshold; i++){
			//int i to count up
			int n = i;
			/*int n to count the Collatz-Problem and still
		  	have int i to put out the start value,
		  	before the Collatz Row is listed**/
			System.out.print(n +": ");
	
			do{
				if(n%2==0){
					n=n/2;
				}
				else{ n=3*n+1;}
		
				System.out.print(n + " ");}
	
			while(n>1);
			System.out.println();
		}
	}	
}
