package PlaylistViewer;

public class SongSearcher {
	private String name;
	private static String year;
	private String artist;
	public SongSearcher(String n, String y, String a) {
		name = n;
		year = y;
		artist = a;
	}
	public static String getYear()
	{
		return year;
	}
}
