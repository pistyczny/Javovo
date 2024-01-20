class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
       this(title,author,releaseDate, pages, publisher);
       this.isbn = isbn;
    }
    Book(String bookTitle, String bookAuthor, int bookRelease, int bookPages, String bookPublisher, String bookIsbn) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.releaseDate = bookRelease;
        this.pages = bookPages;
        this.publisher = bookPublisher;
        this.isbn = bookIsbn;
    }

    void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}