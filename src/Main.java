import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author gribabas = null;
        Book woeFromWit = new Book("Горе от ума", 1825, gribabas);
        gribabas = new Author("Александр", "Грибоедов");
        Author ford = null;
        Book myLife = new Book("Моя жизнь, мои достижения", 1924, ford);
        ford = new Author("Генри", "Форд");
        System.out.print("Книгу-" + woeFromWit.getName() + " " + woeFromWit.getPubYear() + " года выпуска, написал ");
        System.out.println(gribabas.getName() + " " + gribabas.getSurname());
        System.out.print("Книгу-" + myLife.getName() + " " + myLife.getPubYear() + " года выпуска, написал ");
        System.out.println(ford.getName() + " " + ford.getSurname());
        myLife.setPubYear(1922);
        System.out.println("Ой, книгу-" + myLife.getName() + " написали в " + myLife.getPubYear() + " году");
    }
}