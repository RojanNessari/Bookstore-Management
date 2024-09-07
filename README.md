
# Bookstore Management System

This Java project simulates a Bookstore Management System that helps a bookstore owner manage their inventory of books, including adding, updating, and displaying book information based on specific criteria. The system also handles password protection for certain operations.

## Project Overview

The project consists of two main components:
1. **Book Class**: Represents individual books, storing attributes like title, author, ISBN, and price.
2. **Bookstore Driver**: Manages the overall bookstore inventory and provides a menu-driven interface for the bookstore owner to perform various operations.

## Features

- **Book Attributes**: Title, author, ISBN, and price, all of which can be modified.
- **Inventory Management**: Allows for adding, updating, and displaying books in the inventory.
- **Password Protection**: Certain operations (e.g., adding and updating books) are protected by a password.
- **Book Comparison**: Compares two books based on their ISBN and price.
- **Track Number of Books**: Keeps track of how many book objects have been created.
- **Menu-Driven Interface**: Offers several operations to manage the bookstore, such as:
  - Add new books (password required).
  - Update book information (password required).
  - Display all books by a specific author.
  - Display all books below a certain price.
  - Quit the program.

## Classes and Methods

### Book Class
- Attributes:
  - `title` (String)
  - `author` (String)
  - `ISBN` (long)
  - `price` (double)
- Methods:
  - Constructors: Default and parameterized.
  - Accessor and mutator methods for all attributes.
  - `findNumberOfCreatedBooks()`: Returns the number of books created so far.
  - `equals()`: Compares two books by their ISBN and price.
  - `toString()`: Displays the book's details.

### Bookstore Driver
- **main()**: Contains the main logic for interacting with the user, including:
  - Displaying a welcome message.
  - Creating an inventory array for storing book objects.
  - Displaying a menu with options to add, update, or display books.
- Other static methods handle the various menu options, such as:
  - **Option 1**: Add new books after entering the correct password (maximum 3 attempts).
  - **Option 2**: Update book information by selecting a book from the inventory and modifying its attributes.
  - **Option 3**: Display all books by a specific author.
  - **Option 4**: Display all books with a price below a user-specified value.
  - **Option 5**: Quit the program with a closing message.

## Menu Options

The system provides the following menu to the bookstore owner:
```
1. Enter new books (password required)
2. Change information of a book (password required)
3. Display all books by a specific author
4. Display all books under a certain price
5. Quit
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later
- An IDE like IntelliJ IDEA, Eclipse, or any other text editor

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Bookstore-Management-System.git
   ```
2. Compile and run the program using your IDE or terminal.

### Running the Program
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the driver class:
   ```bash
   java BookstoreDriver
   ```

## Author

- **Rojan Nessari**  
  *Concordia University, COMP 249, Winter 2024*



