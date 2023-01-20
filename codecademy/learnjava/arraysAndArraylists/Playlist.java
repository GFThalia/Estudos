package arraysAndArraylists;

/* Desert Island Playlist
 * "Build Playlist.java with the best possible playlist of music using a Java ArrayList."
 */


import java.util.ArrayList;

class Playlist {
	  
	  public static void main(String[] args) {
	  // creating playlist
	  ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
	  // adding albums to playlist
	  desertIslandPlaylist.add("Island by Asunojokei");
	  desertIslandPlaylist.add("White Light From the Mounth of Infinity by Swans");
	  desertIslandPlaylist.add("My Father Will Guide Me Up a Rope to the Sky by Swans");
	  desertIslandPlaylist.add("Doolittle by Pixies");
	  desertIslandPlaylist.add("Deceit by This Heat");
	  desertIslandPlaylist.add("Lateralus by Tool");
	  desertIslandPlaylist.add("Akuma no Uta by Boris");
	  desertIslandPlaylist.add("The Seer by Swans");
	  desertIslandPlaylist.add("Unknown Rooms by Chelsea Wolfe");

	  // printing playlist
	  System.out.println("You has add the following albums: " + desertIslandPlaylist);
	  // checking playlist size
	  System.out.println("Your playlist has " + desertIslandPlaylist.size() + " albums.");

	  // removing albums
	 desertIslandPlaylist.remove("The Seer by Swans");
	 desertIslandPlaylist.remove("My Father Will Guide Me Up a Rope to the Sky by Swans");
	 desertIslandPlaylist.remove("Lateralus by Tool");
	 desertIslandPlaylist.remove("Unknown Rooms by Chelsea Wolfe");

	  System.out.println("Your currently 5 albums playlist: " + desertIslandPlaylist);

	  // swapping albums
	    int indexA = desertIslandPlaylist.indexOf("White Light From the Mounth of Infinity by Swans");
	    int indexB = desertIslandPlaylist.indexOf("Island by Asunojokei");
	    String tempA = "White Light From the Mounth of Infinity by Swans";
	    desertIslandPlaylist.set(indexA, "Island by Asunojokei");
	    desertIslandPlaylist.set(indexB, tempA);
	    
	    System.out.println(desertIslandPlaylist);
	  }
	  
	}