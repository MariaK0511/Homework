package Tasks10_05_22;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Сделайте расчет товаров со скидками. Лучше решить с переменными, чем без.
        /*
          а) товар А стоит (xx) руб и на него скидка 15%,а товар Б стоит (yy) руб.
          Клиент взял 10 A и 2 Б. Выведите итоговую цену:
         */

        System.out.println("Task 1");
        int a = scanner.nextInt();
        int b = 200;
        int discount = 15;
        int discountValue = a * discount / 100;
        int newPrice = a - discountValue;
        int sum = (newPrice * 10) + (b * 2);
        System.out.println(sum);

        /*
         * б) товар А стоит (xx) руб и на него скидка 50%, а товар Б стоит (yy) руб.
         * Клиент взял 7 A и 1 Б. Выведите итоговую цену:
         */

        int a1 = scanner.nextInt();
        int b1 = 120;
        int discount1 = 50;
        int discountValue1 = a1 * discount1 / 100;
        int newPrice1 = a1 - discountValue1;
        int sum1 = (newPrice1 * 7) + b1;
        System.out.println(sum1);

        /*
        в) товар А стоит (xx) руб и на него скидка 10%, а товар Б стоит (yy) руб.
        Клиент взял 2 A и 3 Б. Выведите итоговую цену
         */

        int a2 = scanner.nextInt();
        int b2 = 190;
        int discount2 = 10;
        int discountValue2 = a2 * discount2 / 100;
        int newPrice2 = a2 - discountValue2;
        int sum2 = (newPrice2 * 10) + (b2 * 2);
        System.out.println(sum2);
    }
}
