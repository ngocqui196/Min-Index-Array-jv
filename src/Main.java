import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 8;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
                System.out.println("Nhập số vào phần tử " + i + ".");
                array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println("Min = "+min);
    }
}
