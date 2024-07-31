package Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSearch {

    // Method for linear search
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Method for binary search
    public static Book binarySearchByTitle(List<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; // Book not found
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Sort books by title for binary search
        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        String searchTitle = "1984";
        Book result = binarySearchByTitle(books, searchTitle);

        if (result != null) {
            System.out.println("Book found: " + result);
        } else {
            System.out.println("Book not found.");
        }
    }
}
