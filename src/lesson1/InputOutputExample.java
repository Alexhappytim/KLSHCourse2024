package lesson1;

import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Пока возьмем за данность, что ввод делаем так
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        System.out.println(a);

        int b = scanner.nextInt();
        System.out.print(b);

    }

}