package Student;

public class StudentList {
	private Student[] list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		list[p++] = s;
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
}
