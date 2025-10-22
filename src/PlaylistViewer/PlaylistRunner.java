package PlaylistViewer;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class PlaylistRunner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("playlist.txt");
		Scanner scan = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		System.out.println("Playlist Viewer Menu\r\n"
				+ "(A) View List of Playlists\r\n"
				+ "(B) View a Playlist\r\n"
				+ "(C) Search Songs\r\n"
				+ "(D) Modify a Playlist");
		System.out.println("Select a mode: ");
		String mode = sc.nextLine();
		String play = "";
		int y = 0;
		String[] thing = new String[6];
		
		if (mode.equals("A"))
		{
			System.out.println();
			while (scan.hasNextLine())
			{
				play = scan.nextLine();
				if (play.substring(0, 8).equals("Playlist"))
				{
					System.out.println(" - " + play);
				}
			}
		}
		else if (mode.equals("B"))
		{
			System.out.println("Which playlist would you like to view: ");
			int bum = sc.nextInt();
			bum--;
			while (scan.hasNextLine() && y <= bum)
			{
				for (int i = 0; i < 6; i++)
				{
					thing[i] = scan.nextLine();
				}
				if (y == bum)
				{
					for (int p = 0; p < 6; p++)
					{
						System.out.println(thing[p]);
					}
					
				}
				y++;
			}
		}
	}

}
