package practise;

public class ThreadExample extends Thread {
 public void run() {
	System.out.println("run method called");
 }
	public static void main(String[] args) {
		ThreadExample thread= new ThreadExample();
		
		
         
		thread.start();
		
	}

}
