public class Round {
    Enemies[] enemies;

    public Round() {
        enemies = new Enemies[] {
            new Enemies("Spider", 100, 60, 50, 20, 1),
            new Enemies("Wrags", 150, 110, 90, 10, 2),
            new Enemies("Trolls", 250, 150, 150, 0, 3),
            new Enemies("Vampires", 70, 70, 80, 70, 4),
            new Enemies("Eagles", 210, 130, 110, 10, 5),
            new Enemies("Goblins", 60, 30, 50, 40, 6)
        };
    }
}

