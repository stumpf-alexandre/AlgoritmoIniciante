public class Casting {
    public static void main(String[] args) {
        double d = 3.1415;
        System.out.println("Double d: " + d);

        int i = (int)d;
        int i2 = (int) 3.1415;
        System.out.println("Int i: " + i + ", int i2: " + i2);

        double d2 = 5;
        System.out.println("Double d2: " + d2);

        int i3 = (int)d2;
        System.out.println("Int i3: " + i3);

        int i4 = 10;
        double d3 = i4;
        System.out.println("Double d3: " + d3 + ", int i4: " + i4);

        long l = 10000000000l;
        int i5 = (int)l;
        System.out.println("Long l: " + l + ", int i5: " + i5);

        float f = 3.1415f;
        System.out.println("Float f: " + f);
    }
}
