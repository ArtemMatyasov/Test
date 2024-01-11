import java.util.Scanner;

public class PiKruga {
//Длина круга радиус 4. L = 2 Pi r.
    public static void main(String[] args) {
        System.out.println("Введите радиус");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        double l = 2 * Math.PI * r;
        System.out.println("Длина окружности " + l);
    }
}
