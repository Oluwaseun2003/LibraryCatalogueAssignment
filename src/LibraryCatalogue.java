import java.util.ArrayList;

public class LibraryCatalogue {
    private ArrayList<Books> bookList = new ArrayList<>();

    public void addBook(Books books){
        bookList.add(books);
    }

    public void removeBook(String title){
        for (Books books : bookList){
            if(books.getTitle().equals(title)){
                bookList.remove(books);
                break;
            }
        }
    }

    public  Books findBook(String title){
        for(Books books : bookList){
            if(books.getTitle().equals(title)){
                return books;
            }
        }
        return null;

    }

    public  void findBooks(){
        for(Books books : bookList){
            System.out.println("Title" + books.getTitle());
            System.out.println("Author" + books.getAuthor());
            System.out.println("ISBN" + books.getISBN());
            System.out.println("Genre" + books.getGenre());
        }
    }
}
