import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int volleyballGames = 0;
        int tennisGames = 0;
        int badmintonGames = 0;

        double volleyballPoints = 0;
        double tennisPoints = 0;
        double badmintonPoints = 0;

        String player = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < games; i++) {
            String gameName = scan.nextLine();
            int points = Integer.parseInt(scan.nextLine());

            switch (gameName) {
                case "volleyball":
                    volleyballPoints += points * 1.07;
                    volleyballGames++;
                    break;
                case "tennis":
                    tennisPoints += points * 1.05;
                    tennisGames++;
                    break;
                case "badminton":
                    badmintonPoints += points * 1.02;
                    badmintonGames++;
                    break;
            }
        }

        double volleyballAvgPoints = Math.floor(volleyballPoints / volleyballGames);
        double tennisAvgPoints = Math.floor(tennisPoints / tennisGames);
        double badmintonAvgPoints = Math.floor(badmintonPoints / badmintonGames);
        double totalPoints = Math.floor(volleyballPoints + tennisPoints + badmintonPoints);

        if (volleyballAvgPoints >= 75 && tennisAvgPoints >= 75 && badmintonAvgPoints >= 75) {
            System.out.println(String.format("Congratulations, %s! You won the cruise games with %.0f points.",
                    player, totalPoints));
        } else {
            System.out.println(String.format("Sorry, %s, you lost. Your points are only %.0f.",
                    player, totalPoints));
        }
    }
}
