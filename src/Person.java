public class Person {

	private String name;
	private String address;
	private String email;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 * @param email
	 */
	public Person(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return getName() + " " + getAddress();
	}

}