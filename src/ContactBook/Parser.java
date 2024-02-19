package ContactBook;

import java.util.Scanner;

/**
 * A class to be used by the text interface to properly handle user input.
 * It uses the command words class to verify proper input from the user.
 */
public class Parser {
    
    private CommandWords commands;
    private Scanner reader;

    /**
     * A constructor that intializes an instance of CommandWords and a Scanner.
     */
    public Parser() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * Reads the next command from the user and ensures that all returned input
     *  will be valid to interact with the text interface.
     * @return A valid command.
     */
    public String getCommand() {
        String command = null;
        do {
            System.out.print("> ");

            String word = reader.next();
            readLine();
            if(commands.isCommand(word)) {
                command = word;
            } else {
                System.out.println("Unrecognized command: " + word);
                System.out.println("Valid commands are: ");
                showCommands();
            }
        } while(command == null);

        return command;
    }

    /**
     * Prints out a list of the valid commands to the terminal.
     */
    public void showCommands() {
        System.out.println(commands.showAll());
    }

    /**
     * @return A line of text from the user.
     */
    public String readLine() {
        return reader.nextLine();
    }
}
