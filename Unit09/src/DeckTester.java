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
		
		
		int i = 0; //deal the whole deck
		while (deck1.size() > 0)
		{
			deck1.deal();
			i++;
			System.out.println("Deal number: " + i);
			System.out.println(deck1);
			assert i + deck1.size() == ranks1.length * suits1.length : "Dealing is out of synch";
			System.out.println("Shuffling...");
			deck1.shuffle();
			System.out.println("Shuffled deck: \n" + deck1.printUndealt());
			System.out.println();
		}
		
		
	}
}
