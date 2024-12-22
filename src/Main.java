import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book woeFromWit = new Book("Горе от ума", 1825);
        Author gribabas = new Author("Александр", "Грибоедов");
        Book myLife = new Book("Моя жизнь, мои достижения", 1924);
        Author ford = new Author("Генри", "Форд");
        System.out.print("Книгу-" + woeFromWit.name + " " + woeFromWit.pubYear + " года выпуска, написал ");
        System.out.println(gribabas.name + " " + gribabas.surname);
        System.out.print("Книгу-" + myLife.name + " " + myLife.pubYear + " года выпуска, написал ");
        System.out.println(ford.name + " " + ford.surname);
        myLife.setPubYear(1922);
        System.out.println("Ой, книгу-" + myLife.name + " написали в " + myLife.pubYear + " году");
    }
}