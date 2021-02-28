/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"1", "2", "3"}; String[] suits1 = {"Spades", "Diamonds", "Hearts"}; int[] values1 = {1, 2, 3};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1);
		
	}
}
