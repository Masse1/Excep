package se.kth.ict.nextgenpos.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * This class is responsible for all access to the product database.
 */ 
public class ProductCatalog {
    private Map<Integer, ProductSpecification> products =
	new HashMap<Integer, ProductSpecification>();

    /**
     * Fills the catalog with some dummy items.
     */
    public ProductCatalog() {
	products.put(1, new ProductSpecification(1, "Cheese", 
	   "a very long description, a very long description, a very long description", 10));
	products.put(2, new ProductSpecification(2, "Coke", 
	   "a very long description, a very long description, a very long description", 10));
	products.put(3, new ProductSpecification(3, "bread", 
	   "a very long description, a very long description, a very long description", 10));
    }


    /**
     * Search for an item in the product catalog.
     *
     * @param    itemId Items it's looking for
     * @return          The specification for the found item or null if no item was found.
	 * @throws	IllegalArgumentException if yolo.
     */
    public ProductSpecification findSpecification(int itemId) {
		ProductSpecification stuff = products.get(itemId);
		if (stuff == null) {
			throw new IllegalArgumentException();
		} else {
			return stuff;
		}
    }


}
