
import java.util.Scanner;

//Вчемпионатепофутболукомандезавыигрышдается3очка,запроигрыш—0,заничью—1.
// Известноколичествоочков,полученныхкомандойзаигру.Определитьсловесныйрезультатигры(выигрыш,проигрышилиничья)
public class Rabota {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        short a = num.nextShort();
        if (a==0){
            System.out.println("Проигрыш");
        }
        else if (a==1){
            System.out.println("Ничья");
        }
        else if (a==3){
            System.out.println("Выигрыш");}
}
}
