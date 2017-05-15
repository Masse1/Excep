package se.kth.ict.nextgenpos.view;

import se.kth.ict.nextgenpos.model.Observer;
import se.kth.ict.nextgenpos.model.ProductSpecification;

import java.util.ArrayList;
import java.util.List;

class SomeObserver implements Observer {
private List<ProductSpecification> items = new ArrayList<ProductSpecification>();

    public SomeObserver () {


    }
    //View handling code.

    /**
     * Called by the model when the balance changes.
     */
    public void notify(ProductSpecification spec) {
        items.add(spec);
        System.out.println("CURRENT ITEMS:");
        for (int i = 0; i < items.size(); i++){
            System.out.println(""+ (i+1) + ". " + items.get(i));
        }
    }
}
