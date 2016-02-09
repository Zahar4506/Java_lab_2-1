/*
 Zaharv Alex
 вывести на экран чётные числа от 1 до 100 включительно
 */
package javaapplication2;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte number;
        byte i;
        System.out.println("Четные число: ");
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
