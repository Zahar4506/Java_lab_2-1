/*
 Zaharv Alex
 вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10
 */
package javaapplication2;

import java.io.IOException;

public class Java_2_3 {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
