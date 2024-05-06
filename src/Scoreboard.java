import java.io.*;

public class Scoreboard {
    public Scoreboard() {
        try {
            File score = new File("scoreboard.txt");
            FileWriter sWriter = new FileWriter(score);
            sWriter.write("Cross: " + System.lineSeparator());
            sWriter.write("Circle: ");
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
