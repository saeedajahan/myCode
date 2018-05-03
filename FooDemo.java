package concurrency;



class Fooo{
	public Fooo(){
		
	}
	
	public  void first(Thread t1){
		t1.start();
		System.out.println("thread 0 completed "+Thread.currentThread().getName());
	}
	public void second(Thread t2){
		t2.start();
		System.out.println("thread 1 completed "+Thread.currentThread().getName());
	}
	public void third(Thread t3){
		t3.start();
		System.out.println("thread 2 completed "+Thread.currentThread().getName());
}
	
	
	
	
}

public class FooDemo implements Runnable {
	
	public void run(){
	System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args)  {
		
		Fooo fa=new Fooo();
		FooDemo fa1=new FooDemo();
		Thread t1=new Thread(fa1);
		Thread t2=new Thread(fa1);
		Thread t3=new Thread(fa1);
			
		fa.first(t1);
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fa.second(t2);
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fa.third(t3);
		
		
	}

	

}
