package LengthMeter;

/**
 * Created by Олесь on 17.04.2016.
 */
public class LengthMeter {
    public  static void main(String args[]){
        double x1 = 1;
        double x2 = 3;
        double y1 = 1;
        double y2 = 6;
        double d = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double D = Math.sqrt(d);
        System.out.println("Растояние между точками = " + D);
    }
}
