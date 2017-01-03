package practise;

public class NewThread implements Runnable {
	public void run() {
		System.out.println("Run method called.");
	}
	
	public static void main(String[] args) {
		
			NewThread n=new NewThread();
			Thread threadone=new Thread(n);  // New state known by getstate() method//
			System.out.println("Thread state after creating object"+threadone.getState());
			threadone.start();
			System.out.println(threadone.getState());	
			}

	}

