package Optional_Homeworks;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Kamil", 17, false);
        Student student2 = new Student("Remek", 21, true);

        StudentService studentService = new StudentService();
        try{
            studentService.drinkAlcohole(student1);
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        try{
            studentService.drinkAlcohole(student2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
