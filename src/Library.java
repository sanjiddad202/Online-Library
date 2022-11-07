public interface Library {
    // Methods
    void addBook(String bookName);

    void issueBook(String bookName);

    void returnBook(String bookName);

    void showAvailableBooks();
}
