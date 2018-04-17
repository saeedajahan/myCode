
public class Student implements Cloneable {
	int id;
public Student(int id){
	this.id=id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override  /// use source jo generate equals and hashcode by using id
//can implement our own
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public String toString() {
	return "Student [id=" + id + "]";
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}



}
