import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int pubYear;

    public Book(String name, int pubYear, Author author) {
        this.name = name;
        this.pubYear = pubYear;
        this.author = author;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public String getName() {
        return this.name;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Книга '" + name + "', " + pubYear + " год, автор: " + author.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;
        return Objects.equals(name, other.name) &&
                pubYear == other.pubYear &&
                Objects.equals(author, other.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pubYear, author);
    }
}