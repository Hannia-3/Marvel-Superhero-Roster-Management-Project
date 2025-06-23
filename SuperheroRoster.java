import java.util.Scanner;

public class SuperheroRoster {

    public static void main(String[] args) {
        
        String[] heroNames = {"Spider-Man", "Quicksilver", "Captain America"};
        String[] abilities = {"Web-slinging", "Superhuman speed", "Combat"};
        int[] powerLevels = {85, 90, 75};

        
        System.out.println("--- Hero Details ---");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
        }
        System.out.println();

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hero name to search: ");
        String targetHero = scanner.nextLine();
        searchHero(heroNames, abilities, powerLevels, targetHero);
        System.out.println();

        
        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
        System.out.println();

        
        Superhero[] superheroes = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++) {
            superheroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        System.out.println("--- Superhero Objects Details ---");
        for (Superhero hero : superheroes) {
            hero.displayHero();
        }

        scanner.close();
    }

    
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}


class Superhero {
    String name;
    String ability;
    int powerLevel;

    
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    
    public void displayHero() {
        System.out.println("Name: " + name + ", Ability: " + ability + ", Power Level: " + powerLevel);
    }
}
