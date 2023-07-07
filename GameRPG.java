import java.util.Scanner;

public class GameRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner enter = new Scanner(System.in);
        String player;
        int option;

        Screen menu = new Screen();
        do {
            System.out.println("\nWelcome to Middle Earth RPG!");
            System.out.println("Menu\n  1 -> Start Play \n  2 -> Exit");
            option = enter.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println("Write your name: ");
                    enter.nextLine();
                    player = enter.nextLine();
                    System.out.printf("Bem vindo %s!\n", player);
                    chooseClass(menu);
                    break;

                case 2:
                    System.out.println("Fearful goodbye!");
                    break;

                default:
                    System.out.println("Not found option");
                    option = 0;
                    break;
            }

        } while (option != 1 && option != 2);
    }

    public static void chooseClass(Screen menu) {
        Scanner enter = new Scanner(System.in);
        CharacteristicsClasse choose = menu.escolherClasse(enter);

        if (choose != null) {
            System.out.printf("You have chosen the %s", choose.getTipo());
        }
    }

}
