package Homeworks;

import java.util.*;

public class BooksOnShelf implements Comparable<BooksOnShelf> {
    private String title;
    private String author;
    private int yearOfPublication;

    public BooksOnShelf(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksOnShelf that = (BooksOnShelf) o;
        return yearOfPublication == that.yearOfPublication && Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return "BooksOnShelf{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public int compareTo(BooksOnShelf o) {
        int authorComparison = this.author.compareTo(o.author);
        if (authorComparison != 0) {
            return authorComparison;
        }
        return this.title.compareTo(o.title);
    }

    public static void main(String[] args) {
        List<BooksOnShelf> books = new ArrayList<>();
        books.add(new BooksOnShelf("Władca Pierścieni: Drużyna Pierścienia", "J. R. R. Tolkien", 1954));
        books.add(new BooksOnShelf("Ja Inkwizytor Sługa Boży", "Jacek Piekara", 2003));
        books.add(new BooksOnShelf("Ja Inkwizytor Młot na Czarownice", "Jacek Piekara", 2007));
        books.add(new BooksOnShelf("Ja Inkwizytor Łowcy Dusz", "Jacek Piekara", 2006));

        Collections.sort(books);
        for(BooksOnShelf book : books){
            System.out.println(book);
        }

    }
}
