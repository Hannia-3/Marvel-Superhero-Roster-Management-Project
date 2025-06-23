import java.util.Scanner;

public class SuperheroRoster {

    public static void main(String[] args) {

        String[] heroNames = {"Spiderman", "Captain America", "Quicksilver"};
        String[] abilities = {"Web-slinging", "Stamina", "Superhuman speed"};
        int[] powerLevels = {80, 75, 90}

        System.out.println("--Marvel Superhero Database--");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Abilities: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a superhero name to search: ");
        String name = scanner.nextLine();
        boolean heroFound = searchHero (heroNames, abilities, poweLevels, Name);

        
            
            

        

        
