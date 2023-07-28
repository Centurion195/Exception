package lesson2.task2;

/*
Если необходимо, исправьте данный код
 */
public class Main {
    public static void main(String[] args) {
        double d = 0;
        int[] intArray = new int[]{3, 4, 1, 4, 9, 3, 5, 4, 3};
        try {
            if (d == 0) throw new ArithmeticException();
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
