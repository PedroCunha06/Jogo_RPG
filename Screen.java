import java.util.Scanner;

public class Screen {
    Classes[] classes;

    public Screen() {
        classes = new Classes[] {
                new Classes("Men", 150, 100, 100, 5, 60),
                new Classes("Wizard", 100, 60, 130, 7, 100),
                new Classes("Orc", 175, 110, 80, 4, 40),
                new Classes("Anao", 120, 130, 70, 5, 20),
                new Classes("Elf", 140, 110, 120, 2, 60)
        };
    }

    public void TabelaCaracteristicas() {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" N.  |  Type  | Health | Attack | Defense |  XP  | Magic |");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d => | %6s | %.2f  | %.2f  | %.2f | %.2f | %.2f |\n", (i + 1), classes[i].getTipo(),
                    classes[i].getVida(), classes[i].getAtaque(), classes[i].getDefesa(), classes[i].getXP(),
                    classes[i].getMagic());
            System.out.println("-------------------------------------------------------------");
        }

    }

    public Classes getClasse(int index) {
        if (index >= 0 && index < classes.length) {
            return classes[index];
        }
        return null;
    }

    public Classes escolherClasse(Scanner enter) {
        int classe;
        Classes choose = null;

        do {
            System.out.println("Now, you have to choose your class: \n");
            TabelaCaracteristicas();
            classe = enter.nextInt();

            choose = getClasse(classe - 1);

            if (choose == null) {
                System.out.println("Not found option");
            }
        } while (choose == null);
        return choose;
    }
}
