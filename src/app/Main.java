package app;

public class Main {

    public static final double CONV_K = 2.20462;

    public static void main(String[] args) { System.out.println("Converter APP.");
        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Results is " + pounds + "pounds");
    }
    public static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}