public class Student extends User {

    private String course;
    private int turma;

    public Student(String name, String cpf, String email, String course, int turma) {
        super(name, cpf, email);
        this.course = course;
        this.turma = turma;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}