package app;

public class Main {

    private static final double CONV_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double mi = 5;
        double km = 8;
        double kms = convMlsToKms(mi);
        double mls = convKmsToMls(km);
        System.out.println("Result is " + kms + " kilometers and " + mls + " miles.");
    }

    private static double convMlsToKms(double mi) {
        return mi * CONV_K;
    }

    private static double convKmsToMls(double km) {
        return km / CONV_K;
    }
}
