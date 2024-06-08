package app;

public class Main {

    private static final double CONV_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double mi = 5;
        double kms = convMlsToKms(mi);
        System.out.println("Result is " + kms + " kilometers.");
    }

    private static double convMlsToKms(double mi) {
        return mi / CONV_K;
    }
}
