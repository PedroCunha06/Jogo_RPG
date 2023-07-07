import java.util.Scanner;

public class GameRPG {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String player;
        int opcao, classe;

        CharacteristicsClasse choose = null;

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
                    do {
                        System.out.println("Now, you have to choose your class: \n");
                        menu.TabelaCaracteristicas();
                        classe = entrada.nextInt();
                        switch (classe) {
                            case 0:
                                break;
                            case 1:
                                choose = new CharacteristicsClasse("Warrior", 150, 100, 100, 5, 60);
                                break;
                            case 2:
                                choose = new CharacteristicsClasse("Wizard", 100, 60, 130, 7, 100);
                                break;
                            case 3:
                                choose = new CharacteristicsClasse("Orc", 175, 110, 80, 4, 40);
                                break;
                            case 4:
                                choose = new CharacteristicsClasse("Anao", 120, 130, 70, 5, 20);
                                break;
                            case 5:
                                choose = new CharacteristicsClasse("Elf", 140, 110, 120, 2, 60);
                                break;
                            default:
                                System.out.println("Not found option");
                                classe = 0;
                                break;
                        }
                    } while (classe != 1 && classe != 2 && classe != 3 && classe != 4 && classe != 5);

                    System.out.printf("You have chosen the %s", choose.getTipo());
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

}
