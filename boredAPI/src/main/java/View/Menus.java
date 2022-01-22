package View;

import Model.Activity;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Menus {

    Scanner input = new Scanner(System.in);


    public int mainMenu() {
        System.out.println("WELCOME!\nYou must be bored...");
        System.out.println("What would you like to do?");
        System.out.println("1. Search by Activity Type \n" +
                "2. Search by Number of Participants\n" +
                "3. Search by Activity Price\n" +
                "4. Search by Activity Price Range\n" +
                "5. Search by Accessibility\n" +
                "5. Search by Accessibility Range\n" +
                "6. Add a new Activity");
        System.out.println("Enter the number of your selection:");

        String menuSelectionString = input.nextLine();
        int menuSelectionInt = Integer.parseInt(menuSelectionString);

        return menuSelectionInt;
    }


    public String typeSearch() {

        String[] activityTypes = new String[]{"educational", "recreational", "social", "diy", "charity", "cooking", "relaxation", "music", "busywork"};

        System.out.println("Try searching by the one of the following activity types: \n" +
                Arrays.toString(activityTypes));

        String typeSelection = input.nextLine();
        //TODO: verify input

        return typeSelection;
    }


    public int participantsSearch() {
        System.out.println("How many people are bored?");

        String peopleString = input.nextLine();
        int numPeople = Integer.parseInt(peopleString);

        return numPeople;
    }


    public double exactPriceSearch() {
        System.out.println("How much do you want to spend?");

        String priceString = input.nextLine();
        double price = Double.parseDouble(priceString);

        return price;
    }


    public double priceRangeSearch() {

        System.out.println("Enter the lower end of your price range: ");
        String minPriceString = input.nextLine();
        double minPrice = Double.parseDouble(minPriceString);

        System.out.println("Enter the upper end of your price range: ");
        String maxPriceString = input.nextLine();
        double maxPrice = Double.parseDouble(maxPriceString);


        return 0;
    }


    public double accessibilitySearch() {
        System.out.println("Accessibility can be searched on a scale of 0.0 to 1.0 \n" +
                "with 0.0 being the most accessible.");
        System.out.println("Please enter your accessibility search number: ");
        String accessibilitySearch = input.nextLine();
        double accessibility = Double.parseDouble(accessibilitySearch);

        return accessibility;
    }


    public double accessibilityRangeSearch() {
        System.out.println("Accessibility can be searched on a scale of 0.0 to 1.0 \n" +
                "with 0.0 being the most accessible.");

        System.out.println("Please enter the lower end of your search: ");
        String minAccessString = input.nextLine();
        double minAccess = Double.parseDouble(minAccessString);

        System.out.println("\nPlease enter the upper end of your search: ");
        String maxAccessString = input.nextLine();
        double maxAccess = Double.parseDouble(maxAccessString);

        return 0;
    }

    public Activity addNewActivity() {

        Activity activity = new Activity();

        activity.setActivity(newName());
        activity.setAccessibility(newAccessibility());
        activity.setType(newCategory());
        activity.setParticipants(newParticipants());
        activity.setPrice(newPrice());

        return activity;
    }

    public String newName() {
        System.out.println("Please enter the name of your activity: ");
        String name = input.nextLine();
        return name;
    }

    public double newAccessibility() {
        System.out.println("\nPlease enter the accessibility rating of your activity: ");
        String accessibilityStr = input.nextLine();
        double accessibility = Double.parseDouble(accessibilityStr);
        return accessibility;
    }

    public String newCategory() {
        System.out.println("\nPlease enter the category or type of your activity: ");
        String type = input.nextLine();
        return type;
    }

    public int newParticipants() {
        System.out.println("\nPlease enter the number of participants required for your activity: ");
        String participantsStr = input.nextLine();
        int participants = Integer.parseInt(participantsStr);
        return participants;
    }

    public double newPrice() {
        System.out.println("\nPlease enter the price of your activity: ");
        String priceStr = input.nextLine();
        double price = Double.parseDouble(priceStr);
        return price;
    }


}
