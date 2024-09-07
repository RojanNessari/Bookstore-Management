//-------------------------------------------------------------------------------
//Assignment (#0)
//Written by: (Rojan Nessari, Student ID: 40255637 )
//For COMP249 Section s – Winter 2024
// ------------------------------------------------------------------------------


// This program allows us to implement a Book class.
// This class includes attributes such as title, author, ISBN, and price
// Additionally, this class contains the following methods: A constructor (in order to create a new book object), 
// mutators and accessors, a method to find the number of created books, equals method (to compare 2 book objects),
// and a toString (to print each book object)
/**
 * @author Rojan Nessari
 * The Appliance class which contains attributes and methods related to the appliances objects
 */
public class Book {
	// Instance variables for book properties
	private String title;
	private String author;
	private long ISBN;
	private double price;
	private int numBook;
	// Static variable to keep track of the index of created books
	static int indexOfBook;

	// Default constructor
	public Book() {
	}

	// Parameterized constructor to initialize book properties
	public Book(String title, String author, long iSBN, double price, int numBook) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.price = price;
		this.numBook = numBook;
		indexOfBook++;// Increment the index for each created book
	}

	// Getter and setter methods for book properties
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Static method to find the total number of created books
	public static int findNumberOfCreatedBooks() {
		return indexOfBook;
	}

	// Override the equals method to check equality based on ISBN and price
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if (this.ISBN == other.ISBN && this.price == other.price)
			return true;
		else
			return false;
	}

	// Override the toString method to provide a string representation of the book
	public String toString() {
		return ("Book" + numBook + "\n" + "Author:" + author + "\n" + "Title: " + title + " \n" + "ISBN: " + ISBN + "\n"
				+ "Price: " + price);
	}

}
