import java.io.*;

public class Scoreboard {

    public Scoreboard() {
        try {
            File score = new File("scoreboard.txt");
            try (FileWriter sWriter = new FileWriter("scoreboard.txt")) {
                sWriter.write("Cross: " + Game.getCrossWins() + System.lineSeparator());
                sWriter.write("Circle: " + Game.getCircleWins());
            }
            if (score.createNewFile()) {
                System.out.println(score.getName() + " created");
            } else {
                System.out.println("Scoreboard already exists");
            }
        } catch (IOException exception) {
            System.out.println("Unexpected error occurred");
            exception.printStackTrace();
        }
    }
}
