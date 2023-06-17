//Задание 6
//        Есть прямоугольник, у которого известна ширина w и высота h.
//        Найти и вывести на консоль периметр и площадь заданного прямоугольника.
//        Высота и ширина прямоугольника должна задаваться константными переменными в коде программы.

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника:");
        float a = scanner.nextFloat();
        System.out.println("Введите длину прямоугольника:");
        float b = scanner.nextFloat();
        float p = (a + b) * 2;
        float s = a * b;
        System.out.println("Периметр: " + p + "\nПлощадь: " + s);
    }
}
