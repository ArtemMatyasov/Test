//Циклы
//1. Составить программу вывода любого числа любое заданное число раз.
import java.util.Scanner;

public class CiclyINOPOLIS {

    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.print(number+" ");
        }
    }
}
