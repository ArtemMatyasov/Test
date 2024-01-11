import java.util.Scanner;



public class LogOp2 {
    //Площадь круга.S = π × r2 Площадь квадрата S = x*x;

    public static void main(String[] args) {
        System.out.println("Введите радиус круга и сторону квдрата");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        short x = sc.nextShort();
        double rS = (Math.PI * (r * r));
        double xS = x * x;
        if (rS > xS) {
            System.out.println("Длина окружности Больше!");
        }
        else
        {
            System.out.println("Площадь квадрата Больше!!!");
        }
    }
}

