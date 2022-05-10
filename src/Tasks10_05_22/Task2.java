package Tasks10_05_22;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*
    2.Пусть цена товара A обычно составляет (xx) руб, и товара B составляет (yy) руб.
    Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
    Выведите на экран переменную, которая стоимости суммы A+B со скидкой.
    Отдельно выведите на экран сумму скидки от этой покупки.
     */
        System.out.println("Task 2");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int discount = 10;
        int discountValue = ((400 + 200) / discount) * 100;
        int newPrice = (a + b) - discountValue;
        System.out.println(discountValue);
        System.out.println(newPrice);
    }
}
