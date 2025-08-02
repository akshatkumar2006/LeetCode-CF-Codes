package OOPS;

public class Person {
	private String name = "Akshat";
	private int age = 18;

	// default constructor
//	public Person() {
//		
//	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		try {
			// danger code
			if (age < 0) {
//				return;
				throw new Exception("Age can't be negative");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("are! koi n sahi kr le me tere sath hu");
			System.exit(0);
		}
	}
//	public void setAge(int age) throws Exception {
//		if (age < 0) {
////			return;
//			throw new Exception("Age can't be negative");
//		}
//		this.age = age;
//	}

}
