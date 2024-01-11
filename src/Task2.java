public class Task2 {
    public static void main(String[] args) {
        int number = 39;
        int desatki = number / 10;
        int edinicy = number % 10;
        int cyfruplus = desatki + edinicy;
        int cyfrumnoj = desatki * edinicy;

        //System.out.println(desatki);
        //System.out.println(edinicy);
        //System.out.println(cyfruplus);
        //System.out.println(cyfrumnoj);
        System.out.printf(
                "Количество десятков - %d, Количество единиц %d \n Сумма цифр - %d Произведения цифр - %d",
                desatki,
                edinicy,
                cyfruplus,
                cyfrumnoj
        );
    }
}
