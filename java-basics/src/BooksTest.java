import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @org.junit.jupiter.api.Test
    void issue() {
        //Arranging
        Books books = new Books();
        books.status=STATUS.damaged;
        //act
        books.issue();
        /*//assert
        assertEquals(STATUS.issued, books.status);*/
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        //Arranging
        Books books= new Books();
        books.status=STATUS.issued;
       //act
        books.deposit();
       //assert
        assertEquals(STATUS.available, books.status);
    }

    @Test
    void setPrice() {
        Books books = new Books();

        IllegalArgumentException thrown= Assertions.assertThrows(IllegalArgumentException.class,()->{
            books.setPrice(-300);
        });
        Assertions.assertEquals("Price cannot be less than or equal to zero", thrown.getMessage());

    }
}