package Homeworks;

import java.util.Objects;

public class Books {
    private String title;
    private String category;

    public Books(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Tytuł: '" + title + '\'' +
                ", kategoria: '" + category + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(title, books.title) && Objects.equals(category, books.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
