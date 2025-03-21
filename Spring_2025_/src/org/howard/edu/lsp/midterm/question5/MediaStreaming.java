package org.howard.edu.lsp.midterm.question5;
/** Sources https://stackoverflow.com/questions/50576942/java-video-streaming-project */
/**
 * Driver class to demonstrate the streaming service functionality
 */
public class StreamingServiceDriver {
    /**
     * Main method to test the functionality of the streaming service
     */
    public static void main(String[] args) {
        Streamable music = new Music("Still a Friend - Incognito");
        Streamable movie = new Movie("Avengers End Game");
        Streamable audiobook = new Audiobook("A Promised Land – Barack Obama");
        
        System.out.println("Testing common behaviors for all media types:\n");
        
        System.out.println("Testing Music:");
        music.play();
        music.pause();
        music.stop();
        System.out.println();
        
        System.out.println("Testing Movie:");
        movie.play();
        movie.pause();
        movie.stop();
        System.out.println();
        
        System.out.println("Testing Audiobook:");
        audiobook.play();
        audiobook.pause();
        audiobook.stop();
        System.out.println();
        
        System.out.println("Testing unique behaviors for each media type:\n");
        
        System.out.println("Testing Movie-specific behavior (rewind):");
        Movie movieWithRewind = (Movie) movie;
        movieWithRewind.rewind(30);
        System.out.println();
        
        System.out.println("Testing Audiobook-specific behavior (setPlaybackSpeed):");
        Audiobook audiobookWithSpeed = (Audiobook) audiobook;
        audiobookWithSpeed.setPlaybackSpeed(1.5);
        System.out.println();
        
        System.out.println("Testing Music-specific behavior (addToPlaylist):");
        Music musicWithPlaylist = (Music) music;
        musicWithPlaylist.addToPlaylist("Favorites");
        System.out.println();
    }
}