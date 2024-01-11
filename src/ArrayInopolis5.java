import java.util.Random;

public class ArrayInopolis5 {
    //6.Составить программу:
    //1.нахождения минимального значения среди элементов любой строки
    // двумерного массива;
    // 2.нахождения максимального значения среди элементов любого
    // столбца двумерног омассива;
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(4, 6)][r.nextInt(3, 6)];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(-20, 20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        int sumRow = 0;
        for (int i = 0; i < array2d[3].length; i++) {
            if (sumRow > array2d[3][i])
                sumRow = array2d[3][i];
        }

        System.out.println("Mинимальное значение 3 строки = " + sumRow);

        int sumCol = 0;
        for (int i = 0; i < array2d.length; i++) {
            if (sumCol < array2d[i][2])
            sumCol = array2d[i][2];
        }

        System.out.println("Максимальное значения 2 столбца = " + sumCol);
    }
}
