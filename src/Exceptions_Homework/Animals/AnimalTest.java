package Exceptions_Homework.Animals;

public class AnimalTest {
    public static void main(String[] args) {
        Animal krokodyl = new Animal("Krokodyl", "Franek", 3, "mięsożerny", false);
        Animal surykatka = new Animal("Surykatka", "Franek", 4, "mięsożerny", true);
        Animal sarna = new Animal("Sarna", "Bambi", 2, "roślinożerny", true);
        AnimalService animalService = new AnimalService();
        animalService.basicInfo(krokodyl);
        animalService.glaskanieZwierzecia(surykatka);
        try {
            animalService.glaskanieZwierzecia(krokodyl);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        animalService.karmienieZwierzeciaMiesozernego(surykatka);
        try {
            animalService.karmienieZwierzeciaMiesozernego(sarna);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
