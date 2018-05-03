package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sum implements Callable<Integer>{
	static Integer sum=new Integer(0);
	public Integer call() {
		sum=sum+1;
		return sum;
	}
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(1000);
		for(int i=0;i<1000;i++){
		Future<Integer> future=service.submit(new sum());
		try {
			Integer sum=future.get();
			System.out.println("sum of threads is : "+sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		}
		
		
		service.shutdown();
		
				

	}
	
	


}
