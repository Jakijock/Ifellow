package tasks;

import java.util.Random;

public class Task1 {


    public static void main(String[] args) {

        int maxNumber = 10;

        int[] array = new int[10];
        Random rnd = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxNumber);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
            sum+=array[i];
        }

        double middle = (double) sum/array.length;

        System.out.println();
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Middle is " + middle);
    }

}





