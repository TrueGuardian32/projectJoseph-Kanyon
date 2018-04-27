import java.io.FileReader;
import java.util.Scanner;

public class VoteSystemAlpha {
	public static void main(String[] args) {
		int vca = 0, vcb = 0, vcc = 0;
		try
		{
			Scanner inFile = new Scanner(new FileReader("\\src\\votesystem.txt"));
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
