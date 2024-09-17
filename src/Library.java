import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    // метод библиотеки
    public Library() {
        this.books = new ArrayList<>();
    }
    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);
    }
    // Метод для вывода всей коллекции книг
    public void collectionBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста!");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    // Метод для поиска книг по названию
    public List<Book> foundBook(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    // Метод для поиска книг по автору
    public List<Book> authorBook(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    // Метод для поиска книг по году публикации
    public List<Book> yearBooks(int year) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}