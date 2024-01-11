//class Library {
//    public static void main(String[] args) {
//        final String appName = "Biblioteka v0.1";
//
//        String title = "W pustyni i w puszczy";
//        String author = "Henryk Sienkiewicz";
//        int releaseDate = 2010;
//        int pages = 296;
//        String publisher = "Greg";
//        String isbn = "9788373271890";
//
//        System.out.println(appName);
//        System.out.println("Książki dostępne w bibliotece:");
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(releaseDate);
//        System.out.println(pages);
//        System.out.println(publisher);
//        System.out.println(isbn);
//    }
//}

class Library  {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 296;
        book1.publisher = "Greg";
        book1.isbn = "9788373271890";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);


    }
}