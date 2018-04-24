package problem2;

public class Student extends Person{
	
	 public Student(String name) {
			super(name);
				}
	 	public static final String FRESHMAN = "Freshman";
	    public static final String SOPHOMORE = "Sophomore";
	    public static final String JUNIOR = "Junior";
	    public static final String SENIOR = "Senior";
	    private String status;
	    
	    public Student(String name, String status) {
	        super(name);
	        this.status = status;
	    }

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Student [getName()=" + getName() + "]"+this.getClass().getName();
		}

		
	    

}
