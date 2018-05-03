package concurrency;

//import java.util.ArrayList;

public class DeadlockStudent {
	private String name;
	private int id;
	private String major;
	public  DeadlockStudent(String name, int id, String major) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
	}
	public DeadlockStudent() {
	}
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		
		this.name = name;
	}
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getMajor() {
		return major;
	}
	public  void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "DeadlockStudent [name=" + name + ", id=" + id + ", major=" + major + "]";
	}
	public static  void main(String[] args) {
	//	ArrayList<DeadlockStudent> arraylist=new ArrayList<DeadlockStudent>();
		DeadlockStudent s1=new DeadlockStudent();
		s1.setMajor("cs");
		s1.setName("saeeda");
	Thread t1=new Thread(){
		public void run(){
		
			synchronized(s1.getName()){
				System.out.println("lock on name thread-0");
			  try { 
				  Thread.sleep(1000);} catch (Exception e) {} 
				  System.out.println("name completed by "+Thread.currentThread().getName());
			
				  System.out.println("acquiring major by thread-0"); 
			 synchronized(s1.getMajor()){
			
			System.out.println("major completed by"+ Thread.currentThread().getName());}
			
		}
		
		}
			};

	
	Thread t2=new Thread(){
	public void run(){
		//dead-lock free class can be posiible if we remove any one from following
		//1-mutual exclusion
		//2-no premption
		//3-hold and wait----
		//4-circular wait
		//here we will try to remove circular wait by calling getname first in 2nd thread
		
			synchronized(s1.getMajor()){//s1.getName should call to remove circular wait
			 System.out.println("lock on major thread-1");
		  try { 
			 
			  Thread.sleep(1000);} catch (Exception e) {} 
			  System.out.println("major completed by "+Thread.currentThread().getName());
		
		
			  System.out.println("acquiring name by thread-1");
			  synchronized(s1.getName()){//s1.getmajor
				 
					  System.out.println("name completed by "+Thread.currentThread().getName());}
		
		}
	
	}
	};
					
	t1.start();
	t2.start();

	}
}
	



	