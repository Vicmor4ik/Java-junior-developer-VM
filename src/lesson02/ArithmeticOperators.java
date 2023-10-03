package lesson02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // +-*/ %
        int x=20, y = -1;
        int result = x+y;

        byte var01 = 89, var02 = 11;
        int byteResult01 = var01 + var02;
        byte byteResult02 = (byte) (var01 + var02);

        double bill = 500;
        double halfBill = bill/2;
        System.out.println(halfBill);

        int number = 153, divisor =10;
        double withoutLatDigit = (double) number/divisor;
        System.out.println(withoutLatDigit);

        int n = 40;
        long m = 100L;
        long nmResult = n * m;
        System.out.println(nmResult);

        var var1 = 60L;
        var var2 = -20;
        var var3 = 10.0;
        var varResult = var1+var2+var3;

    }
}
