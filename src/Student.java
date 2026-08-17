public class Student extends User{
    private String name;
    private String cpf;
    private String email;
    private String course;
    private int class;


    public Student (String name , String cpf , String email , String course , private int class){
        super(name , cpf , email);
        this.course = course;
        this.group = group;
        
         }
}