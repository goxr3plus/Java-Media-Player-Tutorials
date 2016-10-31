package application;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Main {

	public Main() {

		// Creating a new Thread
		Thread t = new Thread(() -> {
			// Getting FileInputStream for the audio we want to be played
			try (FileInputStream fis = new FileInputStream("C:/Users/GOXR3PLUS/Desktop/audio.mp3")) {
				Player player = new Player(fis);
				// Play the audio file
				player.play();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		//uncomment this line if you want the application to exit immediately
		//cause no daemon threads exists and the Main Java application thread
		//has exited
		//t.setDaemon(true); 
		t.start();
		System.out.println("Am i daemon?:" + t.isDaemon());

		System.out.println("I am working...");
	}

	public static void main(String[] args) {
		new Main();
	}

}
