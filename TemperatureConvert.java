package TemperatureConvert;

/**
 * Created by Олесь on 17.04.2016.
 */
public class TemperatureConvert {
    public static void main(String args[]) {
        double tempC = 25;
        double tempF = 50;
        double convC = (tempF - 32) * 5 / 9;
        double convF = (tempC * 9 /5) + 32;
        System.out.println("Температура по Цельсию: " + convC);
        System.out.println("Температура по Фаренгейту: " + convF);

    }
}
