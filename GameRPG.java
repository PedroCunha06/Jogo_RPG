import java.util.Scanner;

public class GameRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner entrada = new Scanner(System.in);
        String player;
        int opcao;

        Tela menu = new Tela();
        do {
            System.out.println("\nWelcome to Middle Earth RPG!");
            System.out.println("Menu\n  1 -> Start Play \n  2 -> Exit");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Write your name: ");
                    entrada.nextLine();
                    player = entrada.nextLine();
                    System.out.printf("Bem vindo %s!\n", player);
                    chooseClass(menu);
                    break;

                case 2:
                    System.out.println("Fearful goodbye!");
                    break;

                default:
                    System.out.println("Not found option");
                    opcao = 0;
                    break;
            }

        } while (opcao != 1 && opcao != 2);
    }

    public static void chooseClass(Tela menu) {
        Scanner entrada = new Scanner(System.in);
        CharacteristicsClasse choose = menu.escolherClasse(entrada);

        if(choose != null) {
            System.out.printf("You have chosen the %s", choose.getTipo());
        }        
    }
}
