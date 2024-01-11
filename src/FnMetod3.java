import java.util.Scanner;

public class FnMetod3 {
    public static void main(String[] args) {
        // 3.Даны стороны двух треугольников.
        // Найти сумму их периметров и сумму их площадей
        // .(Определить процедуру для расчета периметра и площад и треугольника
        // по его сторонам.S = √p · (p — a)(p — b)(p — c)  р-пол перриметра
        Scanner sc = new Scanner(System.in);
        info("Введите стороны 1 треугольника");
        short num1 = sc.nextShort();
        short num2 = sc.nextShort();
        short num3 = sc.nextShort();
        info("Введите стороны 2 треугольника");
        short num4 = sc.nextShort();
        short num5 = sc.nextShort();
        short num6 = sc.nextShort();

        int result1 = summaPer(num1, num2, num3);
        int result2 = summaS(num1, num2, num3);
        int result3 = summaPer(num4, num5, num6);
        int result4 = summaS(num4, num5, num6);
        int sumPer = sum(result1, result3);
        int sumS = sum(result2, result4);

        info("Сумма Периметров: " + sumPer);
        info("Сумма Площадей: " + sumS);
    }
    public static int sum (int a, int b) {
        return a+b;
    }
     public static int summaPer(short a, short b, short c) {
        return a + b + c;
    }
    public static int summaS(short a, short b, short c) {
        double p = (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // прямо по формуле Герона
    }
    public static void info(String word) {
        System.out.println(word);
    }
}
