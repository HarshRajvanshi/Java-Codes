import java.util.*;



public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n0 for rock, 1 for paper, 2 for Scissor");
            int user = in.nextInt();

            Random random = new Random();
            int bot = random.nextInt(3);
            if (user == bot) {
                System.out.println("draw");
            } else if (bot == 0 && user == 1 || bot == 1 && user == 2 || bot == 2 && user == 0) {
                System.out.println("user won");
                System.out.printf("user had %d and bot had %d", user, bot);
            } else {
                System.out.println("bot won");
                System.out.printf("user had %d and bot had %d", user, bot);
            }


        }
    }
}
