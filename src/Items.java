/**
 * Базовый уровень. Вариант 2. Задание: Вывести данные о товарах с ценой ниже средней.
 */

import java.util.Arrays;

public class Items {
    Item[] items;

    public Items() {
        this.items = new Item[0];
    }

    public void addItem(Item item) {
        Item[] temp = Arrays.copyOf(items, items.length + 1);
        temp[items.length] = item;
        items = temp;
    }

    public Items CostLowerAwerage() {
        Items temp = new Items();
        int sum = 0;
        for (Item item : items) {
            sum += item.getCost();
        }
        sum = sum / items.length;
        for (Item item : items) {
            if (item.getCost() < sum)
                temp.addItem(item);
        }
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(items) + "\n";
    }
}
