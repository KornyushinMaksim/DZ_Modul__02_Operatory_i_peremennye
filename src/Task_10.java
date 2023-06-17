//Задание 10
//        Написать программу расчета идеального веса к росту.
//        константах хранятся рост (height) и вес (weight).
//        Вывести на консоль сообщение, сколько килограмм нужно набрать или сбросить
//        (идеальный вес = рост - 110).

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рост(см)");
        int l = scanner.nextInt();
        System.out.println("Вес(кг)");
        int m = scanner.nextInt();
        System.out.println((m > (l - 110)) ? "Нужно сбросить " + (m - (l - 110)) + " кг" :
                "Нужно набрать " + ((l - 110) - m) + " кг");
    }
}
