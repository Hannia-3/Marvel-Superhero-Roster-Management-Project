import java.util.Scanner;

public class SuperheroRoster {

    public static void main(String[] args) {
        String[] heroNames = {"Spiderman", "Captain America", "Quicksilver"};
        String[] abilities = {"Web-slinging", "Stamina", "Superhuman speed"};
        int[] powerLevels = {80, 75, 90};

        System.out.println("--Marvel Superhero Database--");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Abilities: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
        }

        String targetHero = "Spiderman";
        System.out.println("\nSearching for:" + targetHero);
        searchHero(heroNames, abilities, powerLevels, targetHero);

        targetHero = "Captain America";
        System.out.println("\nSearching for:" + targetHero);
        searchHero(heroNames, abilities, powerLevels, targetHero);

        targetHero = "Quicksilver";
        System.out.println("\nSearching for:" + targetHero);
        searchHero(heroNames, abilities, powerLevels, targetHero);

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("\nAverage Power Level: " + String.format("%.2f", averagePower));
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found: " + names[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero '" + target + "' not found.");
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        if (powerLevels.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}
        
        
        
            
            

        

        
