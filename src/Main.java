
public class Main {
    public static void main(String[] args) {


        Book[] book = new Book[2];
        book[0] = new Book("Три мушкитера", "Александр", "Дюма");
        book[1] = new Book("Война и мир", "Лев", "Толстой");
        for (Book i : book) {
            System.out.println(i);
        }

    }
}