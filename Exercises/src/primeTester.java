
public class primeTester {

	public static void main(String[] args) {

		int n = 2;
		for(n <= 1000; n=n+1;)
		//System.out.println(isPrime(1000));
	}

	private static boolean isPrime(int n){
	
		boolean prime = true;
		int i = 2;
	

		if(n == 1){
			prime = false;
		}
		else{
			while (i <= n-1 && prime == true){
				if (n%i==0) {
					prime = false;
				}
	     
				i = i+1;
			}
		}
		return prime;
		
		
	}
}
