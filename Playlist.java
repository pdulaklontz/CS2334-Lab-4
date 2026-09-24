import java.util.Arrays;

public class Playlist {
	private Song[] songs;
	private int numSongs;
	
	private static final int MIN_CAPACITY = 3;
	
	Playlist()
	{
		songs = new Song[MIN_CAPACITY];
		numSongs = 0;
	}
	
	Playlist(int capacity)
	{
		if (capacity < MIN_CAPACITY) {
			songs = new Song[MIN_CAPACITY];
		}
		else {
			songs = new Song[capacity];
		}
		
		numSongs = 0;
	}
	
	// Getters
	public int getCapacity() { return songs.length; }
	
	public int getNumSongs() { return numSongs; }
	
	public Song getSong(int index)
	{
		if (index < 0 || index >= numSongs) {
			return null;
		}
		else { 
			return songs[index];
		}
	}
	
	public Song[] getSongs()
	{
		return Arrays.copyOf(songs, numSongs); 
	}
	
	// Adding Methods
	public boolean addSong(int index, Song song)
	{
		if (numSongs == songs.length) {
			return false;
		}
		else if (index < 0 || index > numSongs) {
			return false;
		}
		else if (song == null) {
			return false;
		}
		
		for (int i = numSongs; i > index; i--) {
			songs[i] = songs[i -1];
		}
		
		songs[index] = song;
		
		numSongs++;
		
		return true;
	}
}
