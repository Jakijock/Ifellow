package tasks.task3;

import tasks.task3.Degree;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градус Цельсия");
        System.out.print("---->  ");
        double degree = in.nextDouble();

        BaseConvert baseConvert = new BaseConvert();
        System.out.println("Градус Фаренгейта: " + baseConvert.convert(degree, Degree.FAHRENHEIT));
        System.out.println("Кельвин: " + baseConvert.convert(degree, Degree.KELVIN));
        System.out.println("Градус Реомюра: " + baseConvert.convert(degree, Degree.RHEOMURA));
    }

    static class BaseConvert {

        public double convert(double degreeCelsius, Degree degree) {
            double degreeResult = 0;
            switch (degree) {
                case KELVIN:
                    degreeResult = 273.1 + degreeCelsius;
                    break;
                case FAHRENHEIT:
                    degreeResult = (double) 32 + degreeCelsius * 1.8;
                    break;
                case RHEOMURA:
                    degreeResult = degreeCelsius * 0.8;
                    break;
                default:
                    System.out.println("Нет таких значений");
                    break;
            }
            return degreeResult;
        }
    }

}





