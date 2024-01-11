import java.util.Random;

import static java.util.Arrays.deepToString;

public class ArrayInopolis3 {
    //4.Дан массив.Вывести на экран сначала его неотрицательные элементы,
    // затем отрицательные;
    public static void main(String[] args) {
        Double[] array = new Double[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = r.nextDouble(-500,500);

        }
       // System.out.println(deepToString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                System.out.println(array[i]);
            }}
        for (int i = 0; i <array.length ; i++) {
            if (array[i]< 0){
                System.out.println(array[i]);
        }




        }
    }
}
