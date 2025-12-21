import task_1.Rectangle;
import task_2.Book;
import task_3.LibraryApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle();

        System.out.println(rectangle1);
        System.out.println("Perimeter:"+rectangle1.perimeter()+"\n");

        System.out.println(rectangle2);

        /*Book book = new Book ("Punishment and crime","Dostoevsky",1866,true);
        book.AsBorrowed();
        System.out.println(book);*/

        /*LibraryApp library = new LibraryApp();
        library.addBook(1,"Punishment and Crime", "Dostoevsky", 1866,true);
        library.addBook(2,"Harry Potter", "Rowling", 1997,true);
        library.addBook(3,"The Lord of the Rings", "Tolkien", 1954,false);

        Scanner user = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to Library App!");
            System.out.println("1. Print all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search books by title");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book by id");
            System.out.println("7. Quit");

            int choice = user.nextInt();
            user.nextLine();

            switch (choice) {
                case 1:
                    library.printBooks();
                    break;

                case 2:
                    System.out.print("Id: ");
                    int id = user.nextInt();
                    user.nextLine();

                    System.out.print("Title: ");
                    String title = user.nextLine();

                    System.out.print("Author: ");
                    String author = user.nextLine();

                    System.out.print("Year: ");
                    int year = user.nextInt();

                    library.addBook(id, title, author, year, true);
                    System.out.println("Book added");
                    break;

                case 3:
                    System.out.print("Enter title: ");
                    String search = user.nextLine();
                    library.searchByTitle(search);
                    break;

                case 4:
                    System.out.print("Id: ");
                    library.borrowBook(user.nextInt());
                    break;

                case 5:
                    System.out.print("Id: ");
                    library.returnBook(user.nextInt());
                    break;

                case 6:
                    System.out.print("Id: ");
                    library.deleteBook(user.nextInt());
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Wrong input");
            }
        }*/
    }
}
