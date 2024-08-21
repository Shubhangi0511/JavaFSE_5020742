import java.util.Arrays;

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].getTitle().equals(title)) {
                return books[mid];
            } else if (books[mid].getTitle().compareTo(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}