package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Max Value " + myMaxIntValue);
        System.out.println("Busted Max value " + (myMaxIntValue+1));
        System.out.println("Busted Min value " + (myMinIntValue-1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Max Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Max Value " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Max Value " + myMaxLongValue);

        int myTotal = (myMaxIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        byte anotherByte = 126;
        short anotherShort = 32766;
        int anotherInt = 2147483646;
        long anotherLong = 50000+(10*(anotherByte+anotherShort+anotherInt));
        System.out.println(anotherLong);
    }
}
