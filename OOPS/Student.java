package OOPS;

public class Student {

	String name;
	int age;

	public void intoduceYourself() { // non static function
		System.out.println("my name is " + name + " and I am " + age + " years old");
	}

	public void sayHi(String name) { // non static function
		System.out.println(this.name + " say hi to " + name);
		// this referencing to objects data mambers
	}
}
