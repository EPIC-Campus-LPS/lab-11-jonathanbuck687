package StudentData;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StudentRunner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("roster.csv");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine())
		{
			String[] a = new String[16];
			String[][] s = new String[16][5];
			for (int i = 0; i < 16; i++)
			{
				a[i] = scan.nextLine();
				System.out.println(a[i]);
				for (int j = 0; j < 5; j++)
				{
					
					
				}

			}
		}
	}

}
