package lesson2.task1;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        float num;
        while (true) {
            System.out.print("Введите дробное число: ");
            String numLine = scanner.nextLine().replace(',', '.');
            try {
                num = Float.parseFloat(numLine);
                return num;
            } catch (NumberFormatException e) {
                System.out.println(String.format("Ошибка! (%s) Пожалуйста, введите дробное число!", numLine));
            }
        }
    }
}
