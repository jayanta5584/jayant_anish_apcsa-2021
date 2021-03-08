
public class DeckTesterArray {
	
	
	public static void main(String[] args) 
	{
		String[] ranks1 = {"1", "2", "3"}; String[] suits1 = {"Spades", "Diamonds", "Hearts"}; int[] values1 = {1, 2, 3};
		DeckArray deck1 = new DeckArray(ranks1, suits1, values1);
		System.out.println(deck1);
		
		
		int i = 0; //deal the whole deck
		while (deck1.size() > 0)
		{
			deck1.deal();
			i++;
			System.out.println("Deal number: " + i);
			System.out.println(deck1);
			assert i + deck1.size() == ranks1.length * suits1.length : "Dealing is out of synch";
			System.out.println();

		}
	}
}
