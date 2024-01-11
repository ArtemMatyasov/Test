import java.util.Scanner;



public class LogOp3 {
    //Дано двузначное число. Определить: остаток от деления десятков наединицы,
    // результат деления единиц на десятки

    public static void main(String[] args) {
        System.out.println("Введите двухзначное чило");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 10;
        int b = x % 10;


            System.out.println(a % b);
            System.out.println(b / a);
        }
    }


