package ContactBook;

/** 
 * Provide and interface for the user to interact with Contact Book 
 * in the terminal.
 * 
 * One can add contacts, remove contacts, see all contacts, 
 * get one contact, and see the available commands.
 */
public class TextInterface {
    
    private ContactBook book;
    private Parser parser;

    /**
     * Constructor to intialize an instance of TextInterface.
     * @param book The contact book to be manipulated by the 
     * TextInterface instance.
     */
    public TextInterface(ContactBook book) {
        this.book = book;
        parser = new Parser();
    }

    /**
     * Read commands from the user and change or display data appropriately.
     * Loop terminates when user enters 'quit'.  
     */
    public void run() {
        System.out.println("Contact Book.");
        System.out.println("Type 'help' for a list of commands.");

        String command;
        do {
            command = parser.getCommand();
            if (command.equals("add")){
                add();
            } else if (command.equals("get")){
                get();
            } else if (command.equals("list")){
                list();
            } else if (command.equals("remove")){
                remove();
            } else if (command.equals("help")){
                help();
            } else {
                // Do nothing.
            }
        } while(!(command.equals("quit")));

        System.out.println("Contact book closed.  Goodbye!");
    }

    /**
     * Add a new contact.
     */
    private void add() {
        System.out.print("Name: ");
        String name = parser.readLine();
        System.out.print("Phone: ");
        String phone = parser.readLine();
        System.out.print("Email: ");
        String email = parser.readLine();
        System.out.print("Address: ");
        String address = parser.readLine();
        System.out.print("City: ");
        String city = parser.readLine();
        System.out.print("State: ");
        String state = parser.readLine();
        System.out.print("Company: ");
        String company = parser.readLine();
        System.out.print("Role: ");
        String role = parser.readLine();
        book.addContact(new ContactDetails(name, phone, email, address, 
                                           city, state, company, role));
    }

    /**
     * Find a contact matching a given name.
     */
    private void get() {
        System.out.println("Type the name of the contact.");
        String key = parser.readLine();
        ContactDetails result = book.getContact(key);
        System.out.println(result);

    }

    /**
     * List all contacts.
     */
    private void list() {
        System.out.println(book.listContacts());
    }

    /**
     * Remove a contact matching a given name.
     */
    private void remove() {
        System.out.println("Type the name of the contact to be removed.");
        String key = parser.readLine();
        book.removeContact(key);
    }

    /**
     * List all available commands.
     */
    private void help() {
        parser.showCommands();
    }
}
