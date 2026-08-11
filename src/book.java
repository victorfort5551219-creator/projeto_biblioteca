public class Book implemments Disponibility{

    private String title;
    private int year_of_publication;
    private boolean disponibility;
    private String author;

    public Livro(String title, int year_of_publication, String author) {
        this.title = title;
        this.year_of_publication = year_of_publication;
        this.author = author;
        this.disponibility = true;
    }

    public void emprestar() {
        if (!disponibility) {
            throw new RuntimeException("Livro indisponivel");
        } else {
            disponibility = false;
            System.out.println("Emprestimo realizado com sucesso");
        }
    }
}