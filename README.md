# Credit-Card-Interest-Calculator
Credit Card Interest Calculator
Project Description
This project calculates the monthly interest for credit cards based on their balance and annual interest rate. It allows adding multiple credit cards, calculating the total monthly interest, and printing card details.

File Structure
Main.java: The main entry point of the project, demonstrating the usage of the credit card calculator.
Card.java: Represents a credit card with a card number, balance, and annual interest rate.
CreditCardCalculator.java: Manages multiple credit cards and calculates the total monthly interest.
Prerequisites
Java Version: JDK 8 or higher
How to Run
Place all .java files (Main.java, Card.java, CreditCardCalculator.java) in the same directory.
Compile the Java files using the following command:
sh
Copy code
javac Main.java Card.java CreditCardCalculator.java
Run the program using the following command:
sh
Copy code
java Main
Code Overview
Main.java
This file is the entry point of the program. It demonstrates the usage of the credit card calculator by:

Creating instances of Card.
Adding cards to the CreditCardCalculator.
Printing card details and calculating the total monthly interest.
Card.java
This file represents a credit card. Its main functions include:

Defining the attributes of a card (card number, balance, and annual interest rate).
Calculating the monthly interest based on the balance and annual interest rate.
CreditCardCalculator.java
This file manages multiple credit cards. Its main functions include:

Adding and removing cards from the calculator.
Calculating the total monthly interest for all cards.
Printing the details of each card, including the monthly interest.
