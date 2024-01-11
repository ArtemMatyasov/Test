import java.util.Scanner;

public class CiclyINOPOLIS3 {
    //4.Вычислить сумму 1+1/2+1/3+...+1/n.
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++){
            sum = sum + i;}
            //sum += i; короткая запись.
            System.out.println(sum);

    }
}

