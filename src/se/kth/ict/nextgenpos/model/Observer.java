package se.kth.ict.nextgenpos.model;

import java.util.HashMap;

/**
 * This interface is used by objects that want to be notified about changes in the
 * register's balance.
 */
public interface Observer {

    /**
     * Called when the balance changes.
     *
     * @param spec 
     */
    void notify(ProductSpecification spec);
}
