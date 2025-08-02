package OOPS;

public class StudentAClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Akshat Kumar";
		s.age = 18;
		System.out.println(s.name);
		System.out.println(s.age);
		s.intoduceYourself();
		s.sayHi("Arun Kumar");
	}

}
