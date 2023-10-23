public class Main {
    public static void main(String[] args) {
        LibraryCatalogue catalogue = new LibraryCatalogue();

        Books firstbook = new Books("How to know if someone's heart is with you and for you", "Deji Olabode", "978-978-594-137-1", "Love");
        catalogue.addBook(firstbook);

        Books secondbook = new Books("Lovers Journal", "Doctor seun Olabode", "123-456-789", "Love");
        catalogue.addBook(secondbook);

        Books thirdbook = new Books("Shopping for a lover", "Doctor seun Olabode", "123-456-789", "Love");
        catalogue.addBook(thirdbook);

        catalogue.removeBook("Lovers Journal");

        Books foundBook = catalogue.findBook("How to know if someone's heart is with you and for you");
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook.getTitle());
        } else {
            System.out.println("The book you're looking for does not match any book from our data(Either you typed in wrong title or we don't have it).");
        }


        catalogue.listBooks();
    }
}
