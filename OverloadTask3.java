package by.itgenio;

public class OverloadTask3 {
    public static void main(String[] args) {
        printMatrix(2,3, "8");
        System.out.println();
        printMatrix(2,3, (Object) 8);
        System.out.println();
        printMatrix(2,3, 8);
        System.out.println();
        printMatrix(2,3, (byte) 8);
        System.out.println();
        printMatrix(2,3, (long) 8);
        System.out.println();
        printMatrix(2,3, (short) 8);
        System.out.println();
        printMatrix(2,3, (Number) 8);
        System.out.println();
        printMatrix(2,3, (int) 8);
        System.out.println();
        printMatrix(2,3, (Integer) 8);
        System.out.println();
        printMatrix(2,3, (char) 8);
    }

    //Этого метода достаточно для всех вызовов, но по заданию нужно перегрузить 8 различными способами
    public static void printMatrix(int n, int m, Object value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, String value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, int value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, byte value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, long value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, short value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, Number value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, int m, Integer value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
