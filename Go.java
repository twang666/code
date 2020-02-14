package GoHome;

public class Go implements GoHomeable {

	@Override
	public void leaveOffice() {
		System.out.println(name + "Leaving office");

	}

	@Override
	public void goHome() {
		System.out.println(name + "Taking JR");

	}

	@Override
	public void dinner() {
		System.out.println(name + "Having dinner");

	}

	@Override
	public void sleep() {
		System.out.println(name + "Sleeping");

	}

	private String name;

	public Go(String n) {
		this.name = n;

	}
}
