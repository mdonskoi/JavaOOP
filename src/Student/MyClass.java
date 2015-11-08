package Student;
import java.util.Date;

import Student.StudentList;

import java.util.Date;

public class MyClass {

	public static void main(String[] args) {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		sl.add(new Student("Kolya", "Petrov", new Date(1999, 10, 5)));

		int n = sl.findName("Seva");
		int s = sl.findSurname("Petrov");
		int d = sl.findBirthDate(new Date(1970, 3, 28));


		System.out.println("Search by name: " + sl.get(n).getName() + " " + sl.get(n).getBirth().toString());
		System.out.println("Search by surname: " + sl.get(s).getName() + " " + sl.get(s).getBirth().toString());
		System.out.println("Search by birth date: " + sl.get(d).getName() + " " + sl.get(d).getBirth().toString());

		sl.removeFromList("Vasya", "Pupkin");


	}
}
