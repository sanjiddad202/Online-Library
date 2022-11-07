public class Main {
    public static void main(String[] args) {
        // Create an object
        OnlineLibrary myLibrary = new OnlineLibrary();
        myLibrary.addBook("OK");
        myLibrary.addBook("OH");
        myLibrary.addBook("HM");
        myLibrary.addBook("OP");
        myLibrary.showAvailableBooks();
        myLibrary.issueBook("OH");
        myLibrary.showAvailableBooks();
        myLibrary.returnBook("OH");
        myLibrary.showAvailableBooks();
        myLibrary.issueBook("HMM");
        myLibrary.showAvailableBooks();
        myLibrary.returnBook("OO");
        myLibrary.showAvailableBooks();
    }
}