// Superhero.java
public class Superhero {
    String name;
    String ability;
    int powerLevel;

    // Constructor
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Method to display hero details
    public void displayHero() {
        System.out.println("Hero Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("--------------------");
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {
        // Declare and Initialize Arrays
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        // Loop to Display Each Hero's Details
        System.out.println("--- Hero Details ---");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println("--------------------");
        }

        // Create an array of Superhero objects and populate it
        Superhero[] superheroes = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++) {
            superheroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        System.out.println("\n--- Hero Details (from Objects) ---");
        for (Superhero hero : superheroes) {
            hero.displayHero();
        }

        // Search Function (searchHero)
        System.out.println("\n--- Search Hero ---");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Hulk");

        // Calculate Average Power (calculateAveragePower)
        System.out.println("\n--- Average Power ---");
        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
    }

    // Search Function Implementation
    public static void searchHero(String[] heroNames, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < heroNames.length; i++) {
            if (heroNames[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + heroNames[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found: " + target);
        }
    }

    // Calculate Average Power Implementation
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}
