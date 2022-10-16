
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList <Info> records = readFromFile(file);

        System.out.println("Team:");
        String team = scan.nextLine();

        int counter = 0;
        int wins = 0;
        int losses = 0;

        for (Info info : records) {
            if (info.getFirstTeam().contains(team)) {
                counter += 1;
                if (info.getFirstTeamScore() > info.getSecondTeamScore()) {
                    wins += 1;
                    info.setWins();
                } else {
                    losses += 1;
                    info.setLosses();
                }
                info.setGames();
            } else if (info.getSecondTeam().contains(team)) {
                counter += 1;
                if (info.getSecondTeamScore() > info.getFirstTeamScore()) {
                    wins += 1;
                    info.setWins();
                } else {
                    losses += 1;
                    info.setLosses();
                }
                info.setGames();
            }
        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

    public static ArrayList <Info> readFromFile(String file) {
        ArrayList <Info> sample = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstTeamScore = Integer.valueOf(parts[2]);
                int secondTeamScore = Integer.valueOf(parts[3]);

                sample.add(new Info(firstTeam, secondTeam, firstTeamScore, secondTeamScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return sample;
    }

}
