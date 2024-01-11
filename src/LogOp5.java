import java.util.Scanner;



public class LogOp5 {
    //Даны два числа. Если квадратный корень из второго числа меньше первого числа,
    // то увеличить второе число в пять раз.

    public static void main(String[] args) {
        System.out.println("Введите Два Числа");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        short x = sc.nextShort();
        if (Math.sqrt(x) < r) {
            double a = Math.pow(r,5);

            System.out.println(a);
        }
        else
        {
            System.out.println("вадратный корень второва числа Больше первого!!!");
        }
    }
}

