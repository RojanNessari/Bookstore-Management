//-------------------------------------------------------------------------------
//Assignment (#0)
//Written by: (Rojan,Nessari Student ID: 40255637)
//For COMP249 Section (s) – Winter 2024
// ------------------------------------------------------------------------------
/**
 This java program is supposed to manage a book store. this simple
 Book Management System is used to effectively and efficiently manage
 registers (new books) and their corresponding attributes like title, author, ISBN and price.
 In this regard a class in Java identified as: Book.
 In this program a driver class is created to run the program.
 The program is executed in the main method.
 */

/**
 * @author Rojan Nessari
 * The Driver class contains the main method as well as some pre-defined method in order to run
 * the Book Management System
 */

import java.util.Scanner;// import scanner 

public class main {
	
	 // Constants and variables declaration
	private final static String pass = "249";// Password for accessing certain functionalities
	private static int count = 0;// Counter for password attempts
	private static String passUser;// User-entered password
	private static int choice;// User's menu choice
	private static int maxBook;// Maximum number of books the bookstore can contain
	private static int numOfBook;// Number of books user wants to enter or update
	 // Method to check if the entered password is correct
	public static boolean cheackPass() {
		return passUser.equalsIgnoreCase(pass);
	}

	public static void main(String[] args) {
		// Program initialization
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the bookstore program ");
		System.out.print("Please enter the maximum number of book that your bookstore can contain: ");
		maxBook = kb.nextInt();
		Book[] inventory = new Book[maxBook];
		 // Main program loop every time that that we want to show the menu
		while (true) {
			while (true) { // loop for checking the passwords that is entered 
				// Main menu
				System.out.println("-----------------------------------------------");
				System.out.print("What do you want to do?" + "\n1. Enter new books (password required)"
						+ "\n2. Change information of a book (password required)"
						+ "\n3. Display all books by a specific author"
						+ "\n4. Display all books under a certain a price." + "\n5. Quit"
						+ "\nPlease enter your choice >");
				choice = kb.nextInt();
				 // Password validation for options 1 and 2
				if (choice == 1 || choice == 2) {

					for (int i = 0; i < 3; i++) {// check password 3 times  
						System.out.print("Please enter your password: ");
						passUser = kb.next();
						if (cheackPass())// to check the validity of password if it is true break the loop .
							break;
						else {  // the program goes trough it when password is incorrect .

							if (choice == 1) {// if user put option1 
								count++;

								if (count != 12 || count != 2) {// if the number of attempt to put password is not 12 or 3  system  will execute wrong pass and go trough for loop 
									System.out.print("Wrong password,");

								}
								if (count == 12) {// the number of incorrect input for user is 12 so the program will be exit 
									System.out.println("Program detected suspicious\n"
											+ "activities and will terminate immediately!");
									System.exit(0);
								}

							}
							if (choice == 2 && count != 2) {// since the user chose option 2 in the menu and insert password wrongly 1 or 2 times 
								System.out.print("Wrong password,");

							}

						}

					}

				}// if the user put the password wrong 3 times the system show the main menu since it's a while loop
				// Menu options
				switch (choice) {
				case 1: {// Enter new books

					if (cheackPass()) {// check pass
						 // Entering new books
						System.out.print("How many books do you want to enter: ");// ask the user the number of book that want to insert.
						numOfBook = kb.nextInt();
						if ((Book.findNumberOfCreatedBooks() + numOfBook > maxBook)) {// if number of book that user want to add is more than the Maximum remaining places.
							System.out.println("Sorry, there is not enough space in the bookstore."
									+ " Maximum remaining places: " + (maxBook - Book.findNumberOfCreatedBooks()));
							break;
						} else if (Book.indexOfBook < maxBook) {

							for (int i = 0; i < numOfBook; i++) {// add each book by asking the user the name of the author, title,isbn and price.
								System.out.println(
										"Please enter the information of the " + (Book.indexOfBook + 1) + " book");
								System.out.println("What is the author name ?");
								String author = kb.next();
								System.out.println("What is the title ?");
								String title = kb.next();
								System.out.println("What is the isbn ?");
								long isbn = kb.nextLong();
								System.out.println("What is the price ?");
								double price = kb.nextDouble();
								int numBook = Book.indexOfBook + 1;
								inventory[Book.indexOfBook] = new Book(title, author, isbn, price, numBook);// add them in the array of obj inventory in the class of book 

							}

						}
					}

					break;// end of opt 1
				}
				case 2: {//Change information of a book
					if (cheackPass()) {// check pass
						int num = 0;
						 // Loop for updating book information
						while (true && num != 5) {
							 // Prompt user to select the book to update
							System.out.println("Which book number do you want to update ?");
							int choice = kb.nextInt();
							 // Check if the selected book is null or the choice is out of bounds
							if (inventory[choice - 1] == null || choice > inventory.length) {
								 // Inform the user about the issue and provide options
								System.out.println(
										"The book is not in the memory if you want to re enter another book pres 1?)  "
												+ " however if you want to quit this operation and go back to the main menu pres 2)");
								  // User choice to re-enter or quit the operation
								int userChoice = kb.nextInt();
								if (userChoice == 2)
									break;// Exit the loop if the user chooses to quit
							}
							 // Display book information before updating
							if (inventory[choice - 1] != null) {
								 // Loop for selecting which information to update
								while (true && num != 5) {
									 // Update the selected information based on user's choice
									System.out.println(inventory[choice - 1]);
									System.out.print("What information would you like to\n" + "change?\n"
											+ "1. author\n" + "2. title\n" + "3. ISBN\n" + "4. price\n" + "5. Quit\n"
											+ "Enter your choice >");
									num = kb.nextInt();
									 // Update the selected information based on user's choice
									switch (num) {
									case 1: {
										System.out.println("What is the new author name?");
										String author = kb.next();
										inventory[choice - 1].setAuthor(author);
										break;
									}
									case 2: {
										System.out.println("What is the new title ?");
										String title = kb.next();
										inventory[choice - 1].setTitle(title);
										break;
									}
									case 3: {
										System.out.println("What is the new ISBN ?");
										int ISBN = kb.nextInt();
										inventory[choice - 1].setISBN(ISBN);
										break;
									}
									case 4: {
										System.out.println("What is the new price ?");
										int price = kb.nextInt();
										inventory[choice - 1].setPrice(price);
										break;
									}
									case 5:
										break;// Quit the updating loop

									}

								}
							}
						}
					}
					break;
				}
				case 3: {// Display books by a specific author
					System.out.println("what is the author name ?");
					String author = kb.next();
					for (int i = 0; i < inventory.length; i++) {
						if (inventory[i].getAuthor().equalsIgnoreCase(author))// go through each book to see if they have same author
							System.out.println(inventory[i]); // display the books with the same author name by order 
					}
					break;
				}
				case 4: { // Display books under a certain price
					System.out.println("Please enter the max price you want for the books: ");
					int max = kb.nextInt();
					for (int i = 0; i < inventory.length; i++) {//  go through each book to see if they price less that the price use wants .
						if (inventory[i].getPrice() <= max)
							System.out.println(inventory[i]);// // display the books with less price in order .
						
					}
					break;
				}
				case 5: { // Quit the program
					System.out.println("Thanks for using the bookstore program!");
					System.exit(0);
					break;

				}
				}// end of menu switch 
				
			}// end of second  loop to check pass

		}// end of first loop for display the menu option 
	
	}// end of main

}// end of class main