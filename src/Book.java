public class Book {
    private String name;
     Author author;
     private int pubYear;

    public Book(String name, int pubYear,Author author) {
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

