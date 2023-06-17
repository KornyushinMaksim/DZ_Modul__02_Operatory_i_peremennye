//Задание 5
//        Подсчитать площадь и длину окружности для круга с радиусом R.
//        Радиус должен быть задан константой в программе.
//        Вывести результат на консоль.

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите радиус: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.141592;
        double p = 2 * pi * r;
        double s = 2 * pi * Math.pow(r,2);
        System.out.println("Длина круга: " + (Math.ceil(p * 1000) / 1000) +
                "\nПлощадь круга: " + (Math.ceil(s * 1000) / 1000));
    }
}
