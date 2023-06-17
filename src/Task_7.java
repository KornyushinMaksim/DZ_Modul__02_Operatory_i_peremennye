//Задание 7
//        Разработать программу, которая позволит при известном годовом проценте
//        вычислить сумму вклада в банке через два года,
//        если задана исходная величина вклада.

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма вклада");
        int m = scanner.nextInt();
        float r = 2; //период вкледа
        System.out.println("Период");
        float t = scanner.nextInt();
        System.out.println("Итоговая сумма: " + Math.ceil((m * Math.pow(1 + (r / 100), t)) * 100) / 100);
    }
}
