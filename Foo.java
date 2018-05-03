package concurrency;

 class Foo1 implements  Runnable{
	
	public Foo1(){		
		
	}
	public synchronized void run(){
		System.out.println("First method : "+Thread.currentThread().getName());
		
	}
	
	
}

 class Foo2 implements Runnable{
	public  void run(){
		System.out.println("second method : "+Thread.currentThread().getName());
	}
 }
 class Foo3 implements Runnable {

	public  void run(){
		System.out.println("third method : "+Thread.currentThread().getName());
		
	}
	
}
public class Foo{
	public static void main(String[] args){
		Runnable foo1=new Foo1();
		Runnable foo2=new Foo2();
		Runnable foo3=new Foo3();
		Thread thread1=new Thread(foo1);
		Thread thread2=new Thread(foo2);
		Thread thread3=new Thread(foo3);
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread3.start();
	}
	}


