package task_3;
import java.util.ArrayList;

public class LibraryApp {

    static class Book {
        int id;
        String title;
        String author;
        int year;
        boolean available;

        Book(int id, String title, String author, int year, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.year = year;
            this.available = available;
        }

        @Override
        public String toString() {
            return id + " " + title + " " + author + " " + year +
                    " " + (available ? "Available" : "Borrowed");
        }
    }

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(int id, String title, String author, int year, boolean available) {
        books.add(new Book(id, title, author, year, available));
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b);
            }
        }
    }

    public void borrowBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.available) {
                    b.available = false;
                    System.out.println("Book borrowed!");
                } else {
                    System.out.println("Book already borrowed");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.available = true;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void deleteBook(int id) {
        books.removeIf(b -> b.id == id);
        System.out.println("Book deleted");
    }
}
