public class CiclyINOPOLIS4 {
    //3.Напечатать таблицу соответствия между весом вфунтах и весом в килограммах для значений
    // 1,2,...,10 фунтов (1фунт=453г).
    public static void main(String[] args) {
        double funt = 0.453;
        double kill = 0;
        for (double i = 1; i<11; i++){
            kill = i;
            kill = kill * funt;
            System.out.println(Math.ceil(i)+ " Килограмм "+kill+" Фунтов");


        }

    }
}
