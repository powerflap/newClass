public class Book {
    String name;
    String author;
    int pubYear;

    public Book(String name, int pubYear) {
        this.name = name;
        this.pubYear=pubYear;
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
}

