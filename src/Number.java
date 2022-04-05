public class Number {
    public static void main(String[] args) {
        byte byteInteger = 10;
        short shortInteger = 20;
        int inInteger = 30;
        long longInteger = 40;

        int sum = byteInteger + shortInteger;
        int num2 = shortInteger + inInteger;
        long num3 = inInteger + longInteger;
        long num4 = byteInteger + longInteger;

        float floatNumber = 1.2f;
        double doubleNumber =4.3;
        float floatSum = 0.001f + 0.001f + 0.001f;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(floatSum);
    }
}
