import java.time.LocalDate;


/**
 * Базовый уровень. Вариант 2. Поля класса:
 * Наименование
 * Количество
 * Цена
 * Производитель
 * Дата поступления на склад
 */
public class Item {

    public static final int MIN_COST = 10;
    public static final int MAX_COST = 1000;
    public static final LocalDate MAX_DATA = LocalDate.now();
    private String name = "";

    private int number = 0;


    private int cost = 0;


    private String maker = "";

    LocalDate dt = LocalDate.now();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0)
            this.number = 0;
        else
            this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < MIN_COST)
            this.cost = MIN_COST;
        else if (cost > MAX_COST)
            this.cost = MAX_COST;
        else
            this.cost = cost;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public LocalDate getDate() {
        return dt;
    }

    public void setDate(LocalDate dt) {
        if (dt.isAfter(MAX_DATA))
            this.dt = MAX_DATA;

        else
            this.dt = dt;
    }


    public Item() {
    }

    public Item(String name, int number, int cost, String maker, LocalDate dt) {
        setName(name);
        setNumber(number);
        setCost(cost);
        setMaker(maker);
        setDate(dt);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name = '" + name + '\'' +
                ", number = " + number +
                ", cost = " + cost +
                ", maker = '" + maker + '\'' +
                ", date = " + dt +
                "}\n";
    }
}
