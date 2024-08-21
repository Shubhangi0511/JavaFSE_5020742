public class Main5 {
        public static void main(String[] args) {
            Book book1 = new Book(1, "Book 1", "Author 1");
            Book book2 = new Book(2, "Book 2", "Author 2");
            Book book3 = new Book(3, "Book 3", "Author 3");

            Book[] books = {book1, book2, book3};

            LibraryManagementSystem lms = new LibraryManagementSystem(books);

            System.out.println("Linear Search:");
            Book foundBook = lms.linearSearchByTitle("Book 2");
            if (foundBook != null) {
                System.out.println("Book ID: " + foundBook.getBookId());
                System.out.println("Title: " + foundBook.getTitle());
                System.out.println("Author: " + foundBook.getAuthor());
            } else {
                System.out.println("Book not found.");
            }

            System.out.println("Binary Search:");
            foundBook = lms.binarySearchByTitle("Book 2");
            if (foundBook != null) {
                System.out.println("Book ID: " + foundBook.getBookId());
                System.out.println("Title: " + foundBook.getTitle());
                System.out.println("Author: " + foundBook.getAuthor());
            } else {
                System.out.println("Book not found.");
            }
        }
    }
