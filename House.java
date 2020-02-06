
public class House {
	
	public void window (int win) {
		System.out.println("The house has "+ win +" windows.");
	}
	
	
	public void door (String doorname) {
		System.out.println("Open the " + doorname+ ",");
		System.out.println("Enter the " + doorname+",");
		System.out.println("Close the " + doorname+".");
	}
	
	public static void main(String[] args) {
		House myhouse = new House ();
		myhouse.window(2);
		System.out.println();
		myhouse.door("frontdoor");
		System.out.println("There is a person in the house.");
		System.out.println();
		myhouse.door("backdoor");
		System.out.println("There is nobody in the house.");
	}
	
	


	
}
