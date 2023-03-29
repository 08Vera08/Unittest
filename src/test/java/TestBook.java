import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBook {
    @Test
    public void testUp() {
        Book book = new Book(
                "John", "Wik", 1995);
        book.up();
        Assertions.assertEquals(book.rating, 4);
    }

    @Test
    public void testYear() {
        Book book = new Book(
                "John", "Wik", 1995);

        Assertions.assertEquals(book.year, 1995);
    }

    @Test
    public void testDown() {
        Book book = new Book(
                "John", "Wik", 1995);
        book.down();
        Assertions.assertEquals(book.rating, 2);
    }


}
