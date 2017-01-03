package practise;

public class NewThread1 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("currently executing thread"+t.getName());
		System.out.println("Run method called.");
	}
	
	public static void main(String[] args) {
		
			NewThread1 n1=new NewThread1();
			NewThread1 n2=new NewThread1();
			NewThread1 n3=new NewThread1();

			Thread t1=new Thread(n1);
			Thread t2=new Thread(n1);
			Thread t3=new Thread(n1);
			t1.setName("First Thread");
			t2.setName("Second Thread");
			t3.setName("Third Thread");
			t1.setPriority(6);
			t1.setPriority(4);
			t1.setPriority(10);
			t1.start();
			t2.start();
			t3.start();
	}
}
			
			
			
			
	
	

