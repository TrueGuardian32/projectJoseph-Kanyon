import java.io.FileReader;
import java.util.Scanner;

public class VoteSystemAlpha {
	public static void main(String[] args) {
		int votecountalpha = 0, votecountbeta = 0, votecountcharlie = 0, votecountmax = 0;
		String VoteFor1 = "", VoteFor2 = "", VoteFor3 = "", VoteFor4 = "", VoteFor5 = "";
		
		//Variables above 
		try
		{
			Scanner inFile = new Scanner(new FileReader("\\src\\votesystem.txt"));
		}
		catch (Exception ex) //Catches Errors
		{
			System.out.println(ex.toString());
		}
	}
}

