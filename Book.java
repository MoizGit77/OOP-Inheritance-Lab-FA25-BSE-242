public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    public void openBook() {
        System.out.println("Opening the book...");
    }

    public int calculateReadingLoad() {
        return pages / 10;
    }


    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPages: %d",title,author,pages);
    }
}
