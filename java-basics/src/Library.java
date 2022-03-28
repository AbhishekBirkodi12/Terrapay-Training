import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    public Map<Integer,Books> books = new HashMap();

    void addBook(Books book) {
        books.put(book.getId(), book);
    }
}
