package ContactBook;

import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * A class to actively maintain contacts as given and removed by the user.
 * Contacts are indexed by the name of the contact.
 */
public class ContactBook {
    private TreeMap<String, ContactDetails> book;
    private int numberOfContacts;

    /**
     * Intialization of the contact book.
     */
    public ContactBook() {
        book = new TreeMap<>();
        numberOfContacts = 0;
    }

    /**
     * Look up a contact by their name and return all details.
     * 
     * @param key The name to be looked up.
     * @return The details of the contact object that corresponds to the name.
     */
    public ContactDetails getContact(String key) {
        return book.get(key);
    }

    /**
     * Return whether or not their is currently a contact using the given key
     * in the contact book.
     * 
     * @param key The name to be looked up
     * @return true if the key is in use, false if not.
     */
    public boolean keyInUse(String key) {
        return book.containsKey(key);
    }

    /**
     * Add a new contact to the book.
     * 
     * @param details the contact to be added.
     */
    public void addContact(ContactDetails details) {
        if (details == null) {
            throw new IllegalArgumentException(
                "Null details passed to addContact.");
        }
        book.put(details.getName(), details);
        numberOfContacts++;
    }

    /**
     * Return the number of contacts currently in the book.
     * 
     * @return The current number of contacts.
     */
    public int getNumberOfContacts() {
        return numberOfContacts;
    }

    /** 
     * Remove the entry with the given key from the contact book.
     * The key should be one that is currently in use.
     * 
     * @param key The name of the contact to be removed.
     * @throws IllegalArgumentException If the key is null.
     */
    public void removeContact(String key) {
        if (key == null) {
            throw new IllegalArgumentException(
                "Null key passed to removeContact.");
        }
        if (keyInUse(key)) {
            ContactDetails details = book.get(key);
            book.remove(details.getName());
            numberOfContacts--;
        }
    }

    /**
     * Return all the contact details as a string.
     * 
     * @return all contact details
     */
    public String listContacts() {
        StringBuilder allContacts = new StringBuilder();
        Set<ContactDetails> sortedContacts = new TreeSet<>(book.values());
        for(ContactDetails details : sortedContacts) {
            allContacts.append(details.toString()).append("\n\n");
        }
        return allContacts.toString();
    }
}
