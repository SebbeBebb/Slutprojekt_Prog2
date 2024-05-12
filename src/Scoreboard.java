import java.io.*;

public class Scoreboard {

    public Scoreboard() {
        try {
            File score = new File("scoreboard.txt");
            FileWriter sWriter = new FileWriter("scoreboard.txt");
            FileReader sReader = new FileReader("scoreboard.txt");

            if (score.createNewFile()) {
                System.out.println(score.getName() + " created");
                sWriter.write("Cross: " + Game.getCrossWins() + System.lineSeparator());
                sWriter.write("Circle: " + Game.getCircleWins());

            } else {
                System.out.println("Scoreboard already exists");
            }
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
        }
    }
}
