public class Student extends Person {

	private String major;
	private String[] courses;
	private char[] grades;
	private int numberCourses;

	/**
	 * 
	 * @param name
	 * @param address
	 * @param email
	 */
	public Student(String name, String address, String email) {
		super(name, address, email);
		/*
		 * setName(name); setAddress(address); setEmail(email);
		 */
		numberCourses = 0;
		courses = new String[50];
		grades = new char[50];
	}

	public int getNumberCourses() {
		return numberCourses;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String[] getCourses() {
		return this.courses;
	}

	public char[] getGrades() {
		return this.grades;
	}

	/**
	 * 
	 * @param course
	 * @param grade
	 */
	public void addCourse(String course, char grade) {
		courses[numberCourses] = course;
		grades[numberCourses] = grade;
		numberCourses++;
	}

	public double calcGPA() {
		double total = 0.0;
		for (char grade : getGrades()) {
			switch (grade) {
			case 'A':
				total += 4;
				break;
			case 'B':
				total += 3;
				break;
			case 'C':
				total += 2;
				break;
			case 'D':
				total += 1;
				break;
			}
		}
		return total / getNumberCourses();
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

}
