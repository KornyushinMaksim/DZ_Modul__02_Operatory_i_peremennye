//Задание 8
//        Зная скорость распространения звука в воздушной среде,
//        можно вычислить расстояние до места удара молнии по времени между вспышкой и раскатом грома.
//        Зная время в секундах между вспышкой и раскатом грома (константа в программе),
//        вычислите расстояния до места удара молнии и выведите его на экран.

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Время (сек): ");
        int t = scanner.nextInt();
        int v = 343;
        System.out.println("Расстояние до молнии: " + t * v + " м");
    }
}
