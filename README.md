## Getting Started

Welcome to Contact Book.  This is the beginnings of a project to build out a CRM of sorts with the target market being independent musical artists.  It may be of use to other categories as well, but I am building it with that in mind.

Much credit must go to BlueJ as I am building this off of a project I saw and completed in their book "Objects First with Java: A Practical Introduction Using BlueJ."  Take a look at their book resources here: https://www.bluej.org/objects-first/ .  Already some small changes have been made (expanded contact details is the primary thing that sticks out), but much of the current functionality and code is or is very close to their functionality and code.  David J. Barnes and Michael Kolling are the authors they note in their code.

Along the way I currently plan to transform this program radically by removing the terminal interface and replacing it with REST API endpoints that will allow for a browser based frontend to be built.  As such I am not particularly worried about bugs that currently exist while interacting with the terminal.  Additionally, I plan to add data structures to allow for tasks to be tracked both in realtion to specific contacts and indepently in a singular task list.  Eventually everything will be store in a SQL database so that a user could have a contact book that persists outside of their active use of the program.

## Folder Structure

The workspace contains two main folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies (of which there are currently none)

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Deployment Instructions

Run in VSCode or run your terminal by navigating to the root directory and running `javac -d bin src/ContactBook/*.java` and then navigating to bin and running `java ContactBook/Main`

## Version History
 1.0 - A basic terminal application with no persisting database or graphical user interface.  While the CLI program is active, contacts can be added and removed at will.  The application currently begins with a demo address book being created.
