
public class Door {

	String doorname;

	public Door(String doorname) {
		this.doorname = doorname;
	}

	void open() {
		System.out.println("Open the " + doorname + ",");
	}

	void close() {
		System.out.println("Close the " + doorname + ".");
	}
}
