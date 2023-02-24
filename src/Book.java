import packag.Author;

public class Book  {
    private String name;
    private Author author;
    private double price;
    private int wty ;

    public Book( String name1, Author author, double price, int wty) {
        this.name = name1;
        this.author = author;
        this.price = price;
        this.wty = wty;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWty() {
        return wty;
    }

    public void setWty(int wty) {
        this.wty = wty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", wty=" + wty +
                '}';
    }
}
