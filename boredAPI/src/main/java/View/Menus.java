package View;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Menus {

    Scanner input = new Scanner(System.in);


    public int mainMenu () {
        System.out.println("WELCOME!\n");
        System.out.println("How would you like to search?");
        System.out.println("1. By Activity Type \n" +
                "2. By Number of Participants\n" +
                "3. By Activity Price\n" +
                "4. By Activity Price Range\n" +
                "5. By Accessibility\n" +
                "5. By Accessibility Range");
        System.out.println("Enter the number of your selection:");

        String menuSelectionString = input.nextLine();
        int menuSelectionInt = Integer.parseInt(menuSelectionString);

        return menuSelectionInt;
    }


    public String typeSearch() {

        String[] activityTypes = new String[] {"educational", "recreational", "social", "diy", "charity", "cooking", "relaxation", "music", "busywork"};

        System.out.println("Try searching by the one of the following activity types: \n" +
                Arrays.toString(activityTypes));

        String typeSelection = input.nextLine();
       //TODO: verify input

        return typeSelection;
    }


    public int participantsSearch () {
        System.out.println("How many people are bored?");

        String peopleString = input.nextLine();
        int numPeople = Integer.parseInt(peopleString);

        return numPeople;
    }


    public double exactPriceSearch () {
        System.out.println("How much do you want to spend?");

        String priceString = input.nextLine();
        double price = Double.parseDouble(priceString);

        return price;
    }



    public double priceRangeSearch () {

        System.out.println("Enter the lower end of your price range: ");
        String minPriceString = input.nextLine();
        double minPrice = Double.parseDouble(minPriceString);

        System.out.println("Enter the upper end of your price range: ");
        String maxPriceString = input.nextLine();
        double maxPrice = Double.parseDouble(maxPriceString);


        return 0;
    }


    public double accessibilitySearch () {
        System.out.println("Accessibility can be searched on a scale of 0.0 to 1.0 \n" +
                "with 0.0 being the most accessible.");
        return 0;
    }






}
