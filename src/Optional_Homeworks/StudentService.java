package Optional_Homeworks;

public class StudentService {
   public void drinkAlcohole(Student student){
        if(student.getAge() < 18){
            throw new UseOfAlcoholeByAMinorException("Alkoholu nie może spożywać osoba poniżej 18 roku życia");
        } else {
            student.setDrunk(true);
            System.out.println(student.getName() + " pił alkohol");
        }
    }
}
