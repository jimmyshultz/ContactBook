package ContactBook;

/**
 * This class holds an array of the words the user can use to interact with the
 * contact book effectively.
 */
public class CommandWords {
    //constant array that holds all allowed words.
    private static final String validCommands[] = {
        "add", "get", "list", "remove", "help", "quit", 
    };

    /**
     * A default constructor for CommandWords
     */
    public CommandWords() {}

    /**
     * Checks whether the given user input aligns with one of the allowed 
     * command words or not.
     * 
     * @param pString The user input string to be checked.
     * @return true if it is allowed, false if not.
     */
    public boolean isCommand(String pString) {
        if (pString != null) {
            for(int i = 0; i < validCommands.length; i++) {
                if(validCommands[i].equals(pString)) {
                    return true;
                }
            }
        }
        //To get here the string must be either null or not in CommandWords
        return false;
    }

    /**
     * Return all available commands in a single string 
     * to be easily printed to the user.
     * @return all commands in a string separated by a single space.
     */
    public String showAll() {
        String allCommands = "";
        for (String command : validCommands) {
            allCommands += command + " ";
        }
        return allCommands;
    }
}
