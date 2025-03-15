package homework_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
