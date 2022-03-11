package tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int minutes;
        int hours;
        int diff;

        System.out.println("Введите часы ");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        if (hours > 23 || hours < 0) {
            System.out.println("Неправильный ввод данных");
            return;
        }
        System.out.println("Введите минуты ");
        minutes = scanner.nextInt();
        if (minutes > 59 || minutes < 0) {
            System.out.println("Неправильный ввод данных");
            return;
        }
        diff = clockCalculate(hours, minutes);
        System.out.println("Угол по часовой стрелки = " + diff);
        System.out.println("Угол против часовой стрелки = " + Math.abs(diff - 360));
    }


    public static int clockCalculate(int hours, int minutes) {

        double diff;
        double minDegree;
        double hoursDegree;

        if (hours > 12) {
            hours -= 12;
        }
        minDegree = minutes * 360 / 60;
        hoursDegree = hours * 30 + (minutes * 30 / 60);
        diff = Math.abs(hoursDegree - minDegree);
        return (int) diff;
    }
}
