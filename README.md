# Java Coffee Shop
## Cafe Shop - Java Program

This repository contains a simple Java program simulating a cafe ordering system.

### Features

* Displays a menu with coffee, tea, and chocolate cake options.
* Generates random prices (between 5 and 19 EGP) for each item.
* Prompts the user to choose an item by number.
* Validates user input (ensures a valid number is entered).
* Displays the chosen item and its price.

### Running the Program

1. Clone this repository to your local machine.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile and run the program using the following command:
```
javac Cafe.java
java Cafe
```
### How it Works

The program uses a `HashMap` to store menu items as keys and their corresponding prices as values. Prices are randomly generated for each item at the start of the program.  

A loop displays the menu with numbered options. The user is then prompted to enter their choice by number. The program validates the user input to ensure a valid number from the menu options is chosen.  

Finally, the program displays the chosen item and its price.

### Dependencies

This program requires no external libraries beyond the standard Java libraries included with the JDK.

### Contributing

Feel free to fork this repository and submit pull requests with improvements or additional features.
