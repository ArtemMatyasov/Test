import java.util.Scanner;


//1.Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры входе выполнения программы.
// Дан массив. Составить программу:
//  1.расчета квадратного корня из любого элемента массива;
//  2.расчета среднегоарифметического двух любых элементов массива;
public class ArrayInopolis {
    public static void main(String[] args) {
        int [] arra = new int [10];//создан массив на 10 элементов
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        for (int i =0; i < 10;i++) {//цикл для заполнения массива
            arra[i] = s.nextInt();//с каждым шагом присваиваем из сканера число
        }
        System.out.println("Введите номер элемента массива для поиска квадратного корня");
        System.out.println("Квадратный корень = "+ sqrt(arra[s.nextInt()]));

        System.out.println("Введите два номера элемента массива для поиска сред. фривметического");
        System.out.println("Ср. арафметическое = " + avg (s.nextInt(), s.nextInt()));
    }
//        for (int i =0; i < 10;i++) {//цикл перебора всех элементов массива
//            System.out.println(arra[i]);//вывод каждого элемента массива
//        }
        //System.out.println(deepToString(arra));Быстрый вывод массива



    public static double sqrt(int element) {
            return Math.sqrt(element);}//Вычесляет квадртный корень

    public static double avg(int element1, int element2 ){
            return (element1 + element2)/2.0; //вычесляет ср. ариф.
    }}


