
public class HelloWorld {

	public static void main(String[] args) {
int a = 5000;
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		try{Thread.sleep(a);}catch(InterruptedException e) {}; //5000 mil.sec. Pause da 1000 zu kurz 
		System.out.println("I waited 5000 miliseconds to say this.");
	}

}
