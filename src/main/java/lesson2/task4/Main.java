package lesson2.task4;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(inputString("Введите текст: "));
    }

    static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                String text = scanner.nextLine();
                if (text.equals("")) {
                    throw new RuntimeException();
                }
                return text;
            } catch (RuntimeException ex) {
                System.out.println("Строка не должна быть пустой! " + ex);
            }
        }
    }
}
