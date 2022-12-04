/**
 * Средний уровень. Вариант 2. Задание: Вывести сведения о машинах марки Ford и зарегистрированных до 2000-го года.
 */

import java.util.Arrays;

public class Cars {
    Car[] cars;

    public Cars() {
        this.cars = new Car[0];
    }

    public void addCar(Car car) {
        Car[] temp = Arrays.copyOf(cars, cars.length + 1);
        temp[cars.length] = car;
        cars = temp;
    }

    public Cars Sorting(String name, int year) {
        Cars temp = new Cars();
        for (Car car : cars) {
            if (car.getBrand().equals(name) && car.getDate().getYear() < year)
                temp.addCar(car);
        }
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(cars) + "\n";
    }
}


