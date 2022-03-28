import java.util.Comparator;

public class College {
    public static void main(String[] args) {
        Library library = new Library();
        Books book = null;//new Books("Learn java",300);
        library.addBook(book);
        DigitalBook digitalBook = new DigitalBook(200,"Learn javascript");
        System.out.println(digitalBook.getTitle());
        library.addBook(digitalBook);


        //sort the book in ascending order wrt price
        System.out.println(library.books);
       /* library.books.sort(new Comparator<Books>(){

            @Override
            public int compare(Books book1, Books book2) {
                return (int)book1.getPrice() - (int)book2.getPrice();
            }
        });*/
        System.out.println(library.books);


    }
}
