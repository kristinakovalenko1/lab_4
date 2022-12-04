import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Item[] item = new Item[4];
        item[0] = new Item("Computer", 5, 100, "China", LocalDate.of(2022, Month.OCTOBER, 3));
        item[1] = new Item("Phone", 1, 10, "Ukraine", LocalDate.of(2021, Month.OCTOBER, 3));
        item[2] = new Item("Tpy Car", 0, 10001, "China", LocalDate.of(2020, Month.OCTOBER, 3));
        item[3] = new Item("Computer Mouse", 5, 1, "USA", LocalDate.of(2022, Month.NOVEMBER, 3));
        System.out.println("All items:");
        for (int i = 0; i < item.length; i++) {
            System.out.println("\n" + item[i]);
        }

        System.out.println("\nItems with cost lower than awerage:");
        Items items = new Items();
        for (int i = 0; i < item.length; i++) {
            items.addItem(item[i]);
        }
        System.out.println(items.CostLowerAwerage());

        Car[] car = new Car[4];
        car[0] = new Car("Ford", "Ford", "average car", 1992, LocalDate.of(1992, Month.OCTOBER, 3));
        car[1] = new Car("Ford", "Ford", "average car", 2001, LocalDate.of(2002, Month.OCTOBER, 3));
        car[2] = new Car("Kia", "Kia", "SUV", 2023, LocalDate.of(2023, Month.OCTOBER, 3));
        car[3] = new Car("CHERY", "CHERY", "SUV", 1890, LocalDate.of(1890, Month.OCTOBER, 3));

        System.out.println("All cars:");
        for (int i = 0; i < car.length; i++) {
            System.out.println("\n" + car[i]);
        }

        System.out.println("\nCars with brand Ford and registration date before 2000:");
        Cars cars = new Cars();
        for (int i = 0; i < car.length; i++) {
            cars.addCar(car[i]);
        }
        System.out.println(cars.Sorting("Ford", 2000));
    }
}
