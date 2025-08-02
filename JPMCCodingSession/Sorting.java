package JPMCCodingSession;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
	static class Student {
		int marks;
		String name; 
		int age;
		public Student(String name, int age, int marks) {
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
	}
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("raj", 22, 76);
		arr[1] = new Student("Akshat", 19, 79);
		arr[2] = new Student("Ayush", 21, 80);
		arr[3] = new Student("akash", 20, 55);
		arr[4] = new Student("shiv", 18, 56);
//		Arrays.sort(arr); // address compare kr rha h
		Arrays.sort(arr, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.marks - o2.marks;
			}
		});
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].name + " " + arr[i].age + " " + arr[i].marks);
		}
	}
}
