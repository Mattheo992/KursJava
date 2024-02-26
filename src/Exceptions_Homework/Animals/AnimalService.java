package Exceptions_Homework.Animals;

public class AnimalService {
    public void basicInfo(Animal animal) {
        System.out.println("Gatunek " + animal.getGatunek() + " ma na imię " + animal.getImie() + " ma "
                + animal.getWiek() + " lat, jest " + animal.getRodzajPozywienia());
    }

    public void glaskanieZwierzecia(Animal animal){
        if(animal.isPrzyjazneDlaLudzi()){
            System.out.println("Głasku, głasku");
        } else throw new AnimalIsDangerousException("Próbujesz pogłaskać niebezpieczne zwierzę. Grozi utratą kończyn bądź życia");
    }

    public void karmienieZwierzeciaMiesozernego(Animal animal){
        if(animal.getRodzajPozywienia().equalsIgnoreCase("mięsożerny")){
            System.out.println("Zwierze jest wzdzięczne za mięsko");}
        else throw new WrongTypeOfFoodException("Zwierzę jest roślinożerne. Nie zje mięsa");
    }
}
