import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

class Stepik1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        String name = in.next();  //считываем имя
        int age = in.nextInt();   // лет
        System.out.println("Привет, меня зовут "+name+". Я работал программистом " +age+" лет.");
    }
}