package problem2;

public class EmployeeTester {

	public static void main(String[] args) {	
		
		Person person = new Person("Saeeda");
        Student student = new Student("Saeeda");
        Employee employee = new Employee("Saeeda");
        Faculty faculty = new Faculty("Saeeda");
        Staff staff = new Staff("Saeeda");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

	}

}
