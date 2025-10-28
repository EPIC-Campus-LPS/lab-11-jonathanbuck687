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
		String[] songs = new String[50];
		String[] artists = new String[50];
		String[] years = new String[50];
		int j = 0;
		while (scan.hasNextLine())
		{
			 if (! scan.nextLine().substring(0, 7).equals("Playlist"))	{
				String[] things = (scan.nextLine().split(","));
			 	j++;
			 }
		}
		int y = 0;
		String[] thing = new String[6];
		String[] ping = new String[60];
		String no = "";
		int count = 0;
		int other = 0;
		
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
		else if (mode.equals("C"))
		{
			System.out.println("What would you like to search by?");
			System.out.println("(A) Artist");
			System.out.println("(B) Year");
			System.out.println("Select a mode: ");
			int i = 0;
			String search = sc.nextLine();
			if (search.equals("A"))
			{
				System.out.println("What artist would you like to search?");
				String searchArtist = sc.nextLine();
				System.out.println("Songs by " + searchArtist + ":");
				
				while (scan.hasNextLine()) {
					String[] songInfo = scan.nextLine().split(",");
					if (songInfo[i + 2].equals(searchArtist))
					{
						System.out.println(songInfo[0]);
					}
					i++;
				}
			}
		}
	}

}
