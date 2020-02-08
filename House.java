
public class House {
	String action;

	Door frontdoor;
	Door backdoor;

	public House(String action) {
		this.action = action;
		frontdoor = new Door("frontdoor");
		backdoor = new Door("backdoor");
	}

	void entering() {
		frontdoor.open();
		frontdoor.close();

	}

	void leaving() {
		backdoor.open();
		backdoor.close();

	}

	public static void main(String[] args) {
		House Entering = new House("Entering");
		Entering.entering();
		System.out.println("There is a person in the house.");
		System.out.println();
		House Leaving = new House("Leaving");
		Leaving.leaving();
		System.out.println("There is nobody in the house.");
	}

}
