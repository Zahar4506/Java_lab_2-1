/*
 Zaharv Alex
 Ввести с клавиатуры два числа, и вывести на экран минимальное из них 
 (Поиск минимума выполняется в функции)
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author zam1541b
 */
public class Java_2_4 {

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

        minimum(m, n);
    }

    public static void minimum(int m, int n) {
        if (m < n) {
            System.out.println(m+" - минимум");

        } else {
            System.out.println(n+" - минимум");

        }
    }

}
