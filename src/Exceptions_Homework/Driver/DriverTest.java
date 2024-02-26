package Exceptions_Homework.Driver;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Kamil", "Zdun", 21, true);
        Driver driver2 = new Driver("Adam", "Borek", 25, false);
        Driver driver3 = new Driver("Maciej", "Wąsik", 17, false);
        DriverService driverService = new DriverService();

        try {
            driverService.driveACar(driver1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            driverService.driveACar(driver2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            driverService.driveACar(driver3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}


