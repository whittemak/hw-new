public class Book {
    private  String name;
    private int yearOfPublication;
    private String author;
    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public String getAuthor() {
        return author;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

