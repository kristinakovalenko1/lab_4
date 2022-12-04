import java.time.LocalDate;
import java.time.Month;

/**
 * Средний уровень. Вариант 2. Поля класса:
 * Марка автомобиля
 * Производитель
 * Тип
 * Год выпуска
 * Дата регистрации
 */
public class Car {
    public static final int MIN_YEAR = 1990;
    public static final int MAX_YEAR = 2022;
    public static final LocalDate MIN_DATA = LocalDate.of(1990, Month.JANUARY, 1);
    public static final LocalDate MAX_DATA = LocalDate.now();

    String brand = "";


    String maker = "";


    String type = "";


    int year = 0;
    LocalDate dt = LocalDate.now();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR)
            this.year = MIN_YEAR;
        else if (year > MAX_YEAR)
            this.year = MAX_YEAR;
        else
            this.year = year;
    }

    public LocalDate getDate() {
        return dt;
    }

    public void setDate(LocalDate dt) {
        if (dt.isBefore(MIN_DATA))
            this.dt = MIN_DATA;
        else if (dt.isAfter(MAX_DATA))
            this.dt = MAX_DATA;
        else
            this.dt = dt;
    }

    public Car() {
    }

    public Car(String brand, String maker, String type, int year, LocalDate dt) {
        setBrand(brand);
        setMaker(maker);
        setType(type);
        setYear(year);
        setDate(dt);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", maker = '" + maker + '\'' +
                ", type = '" + type + '\'' +
                ", year = " + year +
                ", registration date = " + dt +
                "}\n";
    }
}
