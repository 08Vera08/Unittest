public class Book {
    String name;
    String author;
    int year;
    int rating;
    String text;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        rating = 3;
        text = "";
    }

    public void up() {
        if (rating < 5) {
            rating = rating + 1;
        }
    }

    public void down() {
        if (rating > 0) {
            rating = rating - 1;
        }
    }

    public void append(String moreText) {
        text += moreText;
    }

    public void printAll() {
        System.out.println("Name of the book: " + name);
        System.out.println("Author of the book: " + author);
        System.out.println("Year of the book: " + year);
        System.out.println("Rating of the book: " + rating);
        System.out.println(text);
    }
}