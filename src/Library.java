import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void listUsers() {
        for (User u : users) {
            u.listarInformacoes();
        }
    }
}