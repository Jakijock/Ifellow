package tasks;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {

        String s = "Hello";
        char[] str = s.toCharArray();

        Set letters = new HashSet();

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    letters.add(str[i]);
                }
                break;
            }
        }

       letters.forEach(System.out::println);

    }
}
