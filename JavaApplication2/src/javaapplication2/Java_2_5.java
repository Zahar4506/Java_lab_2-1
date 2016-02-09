/*
 Zaharov Alex
 Ввести с клавиатуры два имени, и если имена одинаковые,
 вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны»
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
public class Java_2_5 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 имени");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        String n_str = bufferedReader.readLine();

        if ((characters(m_str)) || (characters(n_str))) {
            System.out.println("Введены не верные значения");
            return;
        }

        if (m_str.equals(n_str)) {
            System.out.println("Имена идентичны");
        } else if (m_str.length() == n_str.length()) {
            System.out.println("Длины имен равны");
        } else {
            System.out.println("Имена разные");
        }
    }

    //function for search char функция для проверки символов
    public static boolean characters(String m) {
        char[] chars = m.toCharArray();
        boolean swich = true;
        for (int i = 0; i < chars.length; i++) {
            if (((chars[i] > 1039) && (chars[i] < 1104)) || ((chars[i] > 64) && (chars[i] < 123))) {
                swich = true;
            } else {
                swich = false;
                break;
            }
        }
        return (swich);
    }
}
