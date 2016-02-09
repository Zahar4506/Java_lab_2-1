
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *  Zaharov Alex минимум 4-х чисел
 */
public class Java_2_6 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите 4 числа ");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int m = 0, n = 0, b = 0, v = 0;
        String m_str = bufferedReader.readLine(); //читаем строку с клавиатуры

        try {
            m = Integer.parseInt(m_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
        String n_str = bufferedReader.readLine();

        try {
            n = Integer.parseInt(n_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
        String b_str = bufferedReader.readLine();

        try {
            b = Integer.parseInt(b_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
        String v_str = bufferedReader.readLine();

        try {
            v = Integer.parseInt(v_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }

        

        System.out.println("Минимальное = " + min(min(m, n), min(b, v)));
    }
//функция нахождения минимума function minimum
    public static int min(int x, int y) {
        if (x <= y) {
            return x;
        } else {
            return y;
        }

    }
}
