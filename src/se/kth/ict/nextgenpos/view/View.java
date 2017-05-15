package se.kth.ict.nextgenpos.view;

import se.kth.ict.nextgenpos.controller.Controller;
import se.kth.ict.nextgenpos.model.IllegalItemIdException;
import se.kth.ict.nextgenpos.model.Observer;


/**
 * A placeholder for the view.
 */
public class View {
    private Controller cont;
    private Observer obs;
    /**
     * Creates a new <code>View</code>.
     * @param cont           The controller of the application.
     */
    public View(Controller cont) {

        this.cont = cont;
        this.obs = new SomeObserver();
    }

    /**
     * Simulates a view. Makes some calls to the controller.
     */
    public void test() {
	    cont.makeNewSale();
        cont.addSaleObserver(obs);

        for (int i = 1; i < 5; i++) {
            try {
                enterItem(i);
            } catch (IllegalItemIdException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private void enterItem(int itemId) throws IllegalItemIdException {
	    int quantity = 1;
        cont.enterItem(itemId, quantity);
        System.out.println("");
    }
}
