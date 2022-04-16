package by.itgenio;

public class OverloadTask2 {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Object value) {
        System.out.println("Это Object");
    }

    public static void print(double value) {
        System.out.println("Это double");
    }

    public static void print(Integer value) {
        System.out.println("Это Integer");
    }
}
