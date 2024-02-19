package ContactBook;

public class Demo {
    private ContactBook book;
    private TextInterface interaction;

    public Demo() {
        ContactDetails[] sampleDetails = {
            new ContactDetails("Jimmy", 
                               "1234567890", 
                               "jimmy@email.com", 
                               "112 Main St", 
                               "Philadelphia", 
                               "Pennsylvania", 
                               "Bob Jones Shoes", 
                               "Sales"),
            new ContactDetails("Roberta", 
                               "9134567878", 
                               "roberta@email.com", 
                               "1555 Pennsylvania Ave", 
                               "Washington", 
                               "District of Columbia", 
                               "Amazon", 
                               "Delivery")
        };
        book = new ContactBook();
        for (ContactDetails details : sampleDetails) {
            book.addContact(details);
        }
        interaction = new TextInterface(book);
    }

    public void showInterface() {
        interaction.run();
    }

    public ContactBook getBook() {
        return book;
    }
}
