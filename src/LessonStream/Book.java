package LessonStream;

import java.util.Objects;

public class Book {
    private long id;
    private String title;
    private String author;
    private int publicationYear;
    private double price;
    private boolean isAvailable;

    public Book(long id, String title, String author, int publicationYear, double price, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book bookshop = (Book) o;
        return id == bookshop.id && publicationYear == bookshop.publicationYear && Double.compare(price, bookshop.price) == 0 && isAvailable == bookshop.isAvailable && Objects.equals(title, bookshop.title) && Objects.equals(author, bookshop.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publicationYear, price, isAvailable);
    }

    @Override
    public String toString() {
        return "Bookshop{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
