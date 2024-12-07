import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    public static void main(String[] args) {

        //declare array
        String [] favoriteSongs;

        // String array of favorite songs
        favoriteSongs = new String[]{"Sabrina Carpenter - Taste", "Sabrina Carpenter - Bed Chem","Sabrina Carpenter - Please Please Please","Sabrina Carpenter - Espresso","Bad Bunny - Titi Me Pregunto", "Bad Bunny - Ojitos Lindos","Ariana Grande - Eternal Sunshine","Ariana Grande - Bye", "Ariana Grande - Imperfect For You", "Ariana Grande - I Wish I Hated You"};

        // prints first 3 songs in favorite songs array
        for(int i = 0; i < 3; i++){
            System.out.println(favoriteSongs[i]);
        }
        System.out.println("________________________________________ \n");
        // creates new String ArrayList
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        // adds songs to ArrayList desertIslandPlaylist
        desertIslandPlaylist.add("The Cranberries - Linger");
        desertIslandPlaylist.add("Mazzy Star - Fade Into You");
        desertIslandPlaylist.add("The Marias - No One Noticed");
        desertIslandPlaylist.add("The Marias - Heavy");
        desertIslandPlaylist.add("The Marias - Carino");

        System.out.println(desertIslandPlaylist);
        System.out.println("________________________________________ \n");

        // convert array to a list (to transfer to ArrayList)
        // Add list (favoriteSongs) to ArrayList using addAll() method
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        System.out.println(desertIslandPlaylist);
        System.out.println("There are "+ desertIslandPlaylist.size() + " songs in the Desert Island Playlist.");
        System.out.println("________________________________________ \n");


        // removes 10 songs from ArrayList
        for(int i = desertIslandPlaylist.size() - 1; i >=5; i--) {
            desertIslandPlaylist.remove(i);
        }

        System.out.println(desertIslandPlaylist);

    }
}