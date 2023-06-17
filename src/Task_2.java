//Задание 2
//        В переменной n хранится натуральное (целое) трехзначное число. Создайте программу,
//        вычисляющую и выводящую на экран сумму цифр числа n.

public class Task_2 {
    public static void main(String[] args) {
        int n = 123;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int res = a + b + c;
        System.out.println("Сумма чисел трёхзначного числа: " + res);
    }
}
