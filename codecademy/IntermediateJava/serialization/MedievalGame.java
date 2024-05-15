package codecademy.IntermediateJava.serialization;
import java.util.Scanner;
import java.util.Objects;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MedievalGame {

  /* Instance Variables */
 private Player player;

  /* Main Method */
  public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    MedievalGame game = new MedievalGame();

    game.player = game.start(console);

    game.addDelay(500);
    System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
    System.out.println(game.player);

    game.addDelay(1000);
    System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it.");
    game.save();

    game.addDelay(2000);
    System.out.println("We just saved your game...");
    System.out.println("Now we are going to try to load your character to make sure the save worked...");

    game.addDelay(1000);
    System.out.println("Deleting character...");
    String charName = game.player.getName();
    game.player = null;

    game.addDelay(1500);
    game.player = game.load(charName, console);
    System.out.println("Loading character...");

    game.addDelay(2000);
    System.out.println("Now let's print out your character again to make sure everything loaded:");

    game.addDelay(500);
    System.out.println(game.player);
  } // End of main

  /* Instance Methods */
  private Player start(Scanner console) {
    // Add start functionality here]
    Player player;
    Art.homeScreen();
    System.out.println("Welcome to your latest adventure!");
    System.out.println("Tell me traveler, have you been here before?");
    System.out.print("   Enter 'y' to load a game, 'n' to create a new game: ");
    while (true) {
        String answer = console.next().toLowerCase();
        if (answer.equals("y")) {
            System.out.println("Enter your previous character name:");
            String charName = console.next();
            player = load(charName, console);
            break;
        } else if (answer.equals("n")) {
            System.out.println("Enter your desired character name:");
            String charName = console.next();
            player = new Player(charName);
            break;
        } else {
            System.out.println("Please enter 'y' for yes or 'n' for no:");
        }
    }
    return player;
  } // End of start

  private void save() {
    // Add save functionality here
    String fileName = player.getName() + ".svr";
      try {
        FileOutputStream userSaveFile = new FileOutputStream(fileName);
        ObjectOutputStream playerSaver = new ObjectOutputStream(userSaveFile);
        playerSaver.writeObject(this.player);
        System.out.println("Player saved successfully to file: " + fileName);
    } catch (IOException e) {
        System.out.println("Unable to save the game properly: " + e.getMessage());
    }
  } // End of save

  private Player load(String playerName, Scanner console) {
    // Add load functionality here
     Player loadedPlayer = null;
    try {
      FileInputStream fileInput = new FileInputStream(playerName + ".svr");
      ObjectInputStream objectInput = new ObjectInputStream(fileInput);
      loadedPlayer = (Player) objectInput.readObject();
    } catch (IOException | ClassNotFoundException e) {
        addDelay(1500);
        System.out.println("Unable to find the save file for player: " + playerName);
        addDelay(2000);
        loadedPlayer = new Player(playerName);
    }
    return loadedPlayer;
  } // End of load

  // Adds a delay to the console so it seems like the computer is "thinking"
  // or "responding" like a human, not instantly like a computer.
  private void addDelay(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
