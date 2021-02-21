//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private int playNum;
	private int compNum;
	//rock = 0, paper = 1, scissors = 2

	public RockPaperScissors()
	{
		playChoice = "";
		playNum = -5;
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		playNum = convertRPSInt(playChoice);
	}
	
	public int convertRPSInt(String c)
	{
		if (c.contentEquals("R"))
		{
			return 0;
		}
		else if (c.contentEquals("P"))
		{
			return 1;
		}
		else if (c.contentEquals("S"))
		{
			return 2;
		}
		else { return -5; }
	}
	
	public String convertIntRPS(int a)
	{
		if(a == 0)
		{
			return "R";
		}
		else if (a == 1)
		{
			return "P";
		}
		else if (a == 2)
		{
			return "S";
		}
		else {return "X";}
	}

	public String determineWinner()
	{
		double d = 3* Math.random();
		String response = "";
		compNum = (int) d;
		response += "player had " + convertIntRPS(playNum) + "\ncomputer had " + convertIntRPS(compNum) + "\n";
		if (compNum - playNum == 1 || compNum - playNum == -2)
		{
			response += "!Computer wins ";
			if (compNum == 0)
			{
				response += "<<Rock Breaks Scissors>>!";
			}
			else if (compNum == 1)
			{
				response += "<<Paper Covers Rock>>!";
			}
			else 
			{
				response += "<<Scissor Cuts Paper>>!";
			}
		}
		else if (playNum - compNum == 1 || playNum - compNum == -2)
		{
			response += "!Player wins ";
			if (playNum == 0)
			{
				response += "<<Rock Breaks Scissors>>!";
			}
			else if (playNum == 1)
			{
				response += "<<Paper Covers Rock>>!";
			}
			else 
			{
				response += "<<Scissor Cuts Paper>>!";
			}
		}
		else{response += "!Draw Game!"; }
		return response;
	}

	public String toString()
	{
		return determineWinner() + "\n";
	}
}