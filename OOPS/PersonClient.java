package OOPS;

public class PersonClient {

	public static void main(String[] args) {//throws Exception{
		// TODO Auto-generated method stub
		Person p = new Person("raj", 18);
//		System.out.println(p.name);
//		System.out.println(p.age);
//		Person p1 = new Person(null, 0);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		// error can't be resolved and 
		// exception can be resolved, abnormal behaviour
		p.setAge(-8);
		System.out.println(p.getAge());
	}

}
