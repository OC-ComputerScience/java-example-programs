public class Teacher extends Person {

	private String title;
	private String[] courses;
	private String department;
	private int numberCourses;

	/**
	 * 
	 * @param name
	 * @param address
	 * @param email
	 */
	public Teacher(String name, String address, String email, String title) {
		super(name, address, email);
		this.title = title;
		courses = new String[50];
		numberCourses = 0;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getCourses() {
		return this.courses;
	}

	public void setCourse(String[] courses) {
		this.courses = courses;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNumberCourses() {
		return this.numberCourses;
	}

	public void setNumberCourses(int numberCourses) {
		this.numberCourses = numberCourses;
	}

	/**
	 * 
	 * @param course
	 */
	public boolean addCourse(String course) {
		if (numberCourses < courses.length) {
			courses[numberCourses] = course;
			numberCourses++;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Teacher: " + getName() + " " + getTitle();
	}

}