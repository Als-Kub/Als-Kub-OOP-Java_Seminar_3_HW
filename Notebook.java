/*
Создать класс Notebook с полями (price(double), ram(int))
1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

Повторить про Iterator и Iterable 

 */

public class Notebook {

    double price;
    int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Price = " + price + " " + "RAM = " + ram;
    }

}