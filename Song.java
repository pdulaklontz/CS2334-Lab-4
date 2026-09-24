import java.util.Arrays;

public class Song {
	private String title;
	private String artist;
	
	private int[] time;
	
	Song()
	{
		title = "";
		artist = "";
		time = new int[3];
	}
	
	Song(String title, String artist, int[] time)
	{
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	// Getters
	public String getTitle() { return title; }
	
	public String getArtist() { return artist; }
	
	public int[] getTime() { return Arrays.copyOf(time, time.length); } 

}
