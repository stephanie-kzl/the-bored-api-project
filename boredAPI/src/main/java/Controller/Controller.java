package Controller;

import View.Menus;

public class Controller {

    Menus menu = new Menus();

    public int checkMainSelection() {

        int mainMenuInput = menu.mainMenu();

        if(mainMenuInput == 1) {
            //search by type
            menu.typeSearch();
        } else if (mainMenuInput == 2 ) {
            //search by number of participants
            menu.participantsSearch();
        } else if (mainMenuInput == 3 ) {
            //search by price
            menu.exactPriceSearch();
        } else if (mainMenuInput == 4 ) {
            //search by price RANGE
            menu.priceRangeSearch();
        } else if (mainMenuInput == 5 ) {
            //search by accessibility
            menu.accessibilitySearch();
        } else if (mainMenuInput == 6 ) {
            //search by accessibility RANGE
            menu.accessibilityRangeSearch();
        }



        return 0;
    }
}
