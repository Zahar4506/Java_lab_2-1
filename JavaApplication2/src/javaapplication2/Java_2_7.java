
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Zaharov Alex Программа определения координатной четверти
 */
public class Java_2_7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите координаты точки");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int x = 0, y = 0;
        String x_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        try {
            x = Integer.parseInt(x_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
        String y_str = bufferedReader.readLine();
        try {
            y = Integer.parseInt(y_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }

        

        if ((x == 0) || (y == 0)) {
            System.out.println("Ввели недопустимые по условию значения");
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Точка в 1ой четверти");
                } else {
                    System.out.println("Точка в 4ой четверти");
                }
            } else if (y > 0) {
                System.out.println("Точка в 2ой четверти");
            } else {
                System.out.println("Точка в 1ой четверти");
            }
        }
    }

}
