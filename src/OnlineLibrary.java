import java.util.Objects;

public class OnlineLibrary implements Library {
    // Variables
    String[] bookSize;
    int numberOfBooks;

    // Constructor
    OnlineLibrary() {
        this.bookSize = new String[100];
        this.numberOfBooks = 0;
    }

    // Methods
    @Override
    public void addBook(String bookName) {
        this.bookSize[numberOfBooks] = bookName;
        numberOfBooks++;
        System.out.println(bookName + " " + "book add successful.");
    }

    @Override
    public void issueBook(String bookName) {
        for (int i = 0; i < this.bookSize.length; i++) {
            if (Objects.equals(this.bookSize[i], bookName)) {
                System.out.println(bookName + " " + "Book issue successful.");
                this.bookSize[i] = null;
                return;
            }
        }
        System.out.println(bookName + " " + "book not found. Book issue failed.");
    }

    @Override
    public void returnBook(String bookName) {
        addBook(bookName);
    }

    @Override
    public void showAvailableBooks() {
        System.out.println("Available book are:");
        for (String item : this.bookSize) {
            if (item == null) {
                continue;
            } else {
                System.out.println("*" + " " + item);
            }
        }
    }
}
