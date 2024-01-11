import java.util.Random;

public class ArrayInopolis4 {
    //5.Дан массив.
// Определить:1.количество максимальных элементов в массиве;
// 2.количество минимальных элементов вмассиве;
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(10, 20)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);

            System.out.print(array[i] + " ");

        }
        int min = array[0];
        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nMax = " + max + " MaxIn =  " + maxIndex);
        System.out.println("Min = " + min + " MinIn = " + minIndex);
        array[maxIndex]=min;
        array[minIndex]=max;
        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i] + " ");

        }

    }

}

