//Задание 9
//        Проверить, имеет ли число вещественную часть.
//        Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0 и 10.0 – нет.

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число для проверки");
        double digit = scanner.nextDouble();
        System.out.println((digit - (int)digit) == 0 ? "Нет вещественной части" : "Есть вещественная часть");
    }
}
