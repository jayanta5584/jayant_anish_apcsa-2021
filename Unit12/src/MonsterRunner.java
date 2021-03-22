//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//ask for name and size
		System.out.println("What is the name of your monster? (1)");
		String name1 = keyboard.nextLine();
		System.out.println("What is the size of your monster? (1)");
		int size1 = keyboard.nextInt();
		System.out.println("What type is your monster? (G for Goblin, S for Skeleton)");
		char type1 = keyboard.next().charAt(0);
		System.out.println();

		//ask for name and size
		System.out.println("What is the name of your monster? (2)");
		String name2 = keyboard.next();
		System.out.println("What is the size of your monster? (2)");
		int size2 = keyboard.nextInt();
		System.out.println("What type is your monster? (G for Goblin, S for Skeleton)");
		char type2 = keyboard.next().charAt(0);

		//instantiate monster one
		Goblin monster1 = null;
		Skeleton monster1 = null;
		
		if (type1 == 'G')
		{
			monster1 = new Goblin(name1, size1);
			System.out.println("Monster 1 - " + monster1);
		}
		else
		{
			Skeleton monster1 = new Skeleton(name1, size1);
			System.out.println("Monster 1 - " + monster1);
		}
		if (type2 == 'G')
		{
			Goblin monster2 = new Goblin(name2, size2);
			System.out.println("Monster 2 - " + monster2);
		}
		else
		{
			Skeleton monster2 = new Skeleton(name2, size2);
			System.out.println("Monster 2 - " + monster2);
		}
		
		if (monster1.isBigger(monster2))
		{
			System.out.println("Monster 1 is bigger than Monster 2");
		}
		else if (monster2.isBigger(monster1))
		{
			System.out.println("Monster 1 is smaller than Monster 2");
		}
		else
		{
			System.out.println("Monsters are the same size");
		}
		
		if (monster1.namesTheSame(monster2))
		{
			System.out.println("monster one has the same name as Monster two");
		}
		else 
		{
			System.out.println("Monster one has a different name than Monster two.")
		}
	}
}