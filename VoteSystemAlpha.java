import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class VoteSystemAlpha {
	public static void main(String[] args) {
		int votecountalpha = 0, votecountbeta = 0, votecountcharlie = 0, votecountmax = 0;
		String VoteFor1 = "", VoteFor2 = "", VoteFor3 = "", VoteFor4 = "", VoteFor5 = "";
		String another = "";
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		
		
		//Finding names of candidates.

		VoteFor1 = "Fortnite";
		VoteFor2 = "PUBG";
		VoteFor3 = "Minecraft";
		VoteFor4 = "Skyrim";
		VoteFor5 = "Oblivion";
		
	
		
		//Variables above 
		try
		{
			PrintWriter outFile = new PrintWriter("src\\votesystem.txt");
			System.out.println("Enter your Favorite Game");
			
			outFile.println(VoteFor1);
			outFile.println(VoteFor2);
			outFile.println(VoteFor3);
			outFile.println(VoteFor4);
			outFile.println(VoteFor5);
			
			while(another != "Stop");
				
			outFile.close();
			
			
		}
		catch (Exception ex) //Catches Errors
		{
			System.out.println(ex.toString());
			
		}
		
		
	}
}
