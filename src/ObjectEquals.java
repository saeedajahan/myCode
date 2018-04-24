
public class ObjectEquals {
	public static void main(String[] args) throws CloneNotSupportedException{

	Student s1=new Student(1);
	Student s2=new Student(1);
	System.out.println(s1.equals(s2));//without overriding it will give false
	
	//clone
	//shallow copy----1 object 2 reference// 1 objects value change affects other
	//1. way
	Student s=new Student(0);
	s.id=5;
	//s.getId();
	
	
	Student ss=s; //not new reference to old object...not new object
	ss.id=7;
	System.out.println(s+"  2nd object reference ---shallow copy  "+ss);//s shoud be 5
	
	
	// Deep copy---creating 2 object --nd copy 1-1 value manually---more value more time consuming...not good
	Student sd=new Student(0);
	sd.id=s.id;
	System.out.println(s+"  2nd object --deep copy "+sd);
	//
	
	//cloning ---combination of shallow copy, deep copy...no need to create abject and assign values..it will do
//	Student sclone=new Student(0);
	Student sclone=(Student) s.clone();//implement Cloneable interface in student class and ovveride it by source
	//nd handle clone not supported exception nd typecast to student class
	System.out.println("3rd object ------clone "+sclone);
}
	
}
