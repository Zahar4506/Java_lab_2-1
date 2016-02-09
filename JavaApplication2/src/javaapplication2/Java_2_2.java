/*
 Zaharv Alex
 вывестити на экран прямоугольник размером m на n из восьмёрок
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Java_2_2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 числа m и n");
        int m = 0, n = 0;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        String n_str = bufferedReader.readLine();

        try {
            m = Integer.parseInt(m_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода числа m");

        }

        try {
            n = Integer.parseInt(n_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода числа n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
