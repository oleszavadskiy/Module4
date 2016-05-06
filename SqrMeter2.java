package SquareMeter;

/**
 * Created by Олесь on 16.04.2016.
 */
public class SqrMeter2 {
    public static void main(String args[]){
    int sideA = 10;
    int sideB = 10;
    int sideC = 15;

    double p = (sideA + sideB + sideC) /2;
    double s = (p * (p - sideA) * (p - sideB) * (p - sideC));
        double S = Math.sqrt(s);

    System.out.println(S);
}
}
