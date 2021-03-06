/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Diamond", 12);
		Card card2 = new Card("Queen", "Spade", 11);
		Card card3 = new Card("King", "Diamond", 12);
		
		//test the accessors
		System.out.println(card1.rank() + " " + card2.suit() + " " + card3.pointValue());
		
		//test the equality function
		System.out.println(card1.matches(card3));
		
		//test the toString function
		System.out.println(card1.toString() + "\n" + card2.toString() + "\n" + card3.toString());
		
		
		
	}
}
