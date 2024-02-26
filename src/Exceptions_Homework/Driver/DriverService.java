package Exceptions_Homework.Driver;

public class DriverService {
    public void driveACar(Driver driver){
        if(driver.getAge() < 18){
            throw new IllegalAgeToHaveADriverLicenceException("Masz za mało lat żeby mieć prawo jazdy");
        } else if (!driver.isDrivingLicence()) {
            throw new IllegalUseOfACarWithoutLicenceException("Nie masz prawda jazdy. Nie możesz jechać samochodem");
        }
        else System.out.println("Jedź śmiało ku zachodzącemu słońcu");
    };
}
