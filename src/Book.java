import java.util.Objects;

public class Book {
    private String nameBook;
    private String name;
    private String surname;

    public Book(String nameBook, String name, String surname) {
        this.nameBook = nameBook;
        this.name = name;
        this.surname = surname;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Книга: " + nameBook + ", Автор: " + name + " " +
                surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(name, book.name) && Objects.equals(surname, book.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, name, surname);
    }
}
