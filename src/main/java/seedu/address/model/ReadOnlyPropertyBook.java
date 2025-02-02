package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.property.Property;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyPropertyBook {

    /**
     * Returns an unmodifiable view of the properties list.
     * This list will not contain any duplicate properties.
     */
    ObservableList<Property> getPropertyList();
}
