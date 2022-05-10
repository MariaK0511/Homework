package Tasks10_05_22;

public class Tasks9_10 {
    public static void main(String[] args) {

        /*
         Посчитайте выражения, выведите их на экран: int x = 5, y = 7, z = 0, k = 9;
        z = xx + yy; z = xxx; k = x / z;
         */
        System.out.println("Task 9");

        double x = 5;
        double y = 7;
        double z = 0;
        double k = 9;
        z = x * x + y * y;
        System.out.println("z = " + z);
        z = x * x * x;
        System.out.println("z = " + z);
        k = x / z;
        System.out.println("k = " + k);

        /*
        10.Объявите 10 переменных типа int со значениями 0 ,1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
        Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Распечатайте её через println. Объявите ещё одну переменную double.
        Продейлате тоже самое. Сравните результат
         */
        System.out.println("Task 10");
        int x1 = 0, x2 = 1, x3 = 2, x4 = 3, x5 = 4, x6 = 5, x7 = 6, x8 = 7, x9 = 8, x10 = 9;
        int y1 = (x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10) / 10;
        System.out.println(y1);
        // у1 получается без остатка
        double y2 = ((double) (x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10) / 10);
        System.out.println(y2);
        // число выходит с остатком 5
    }
}
