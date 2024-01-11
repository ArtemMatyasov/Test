


public class LogOp4 {
    //Даны три вещественных числа a,b,c.
    // Проверить:1. выполняется ли неравенство a<b<c;
    // 2.выполняется ли неравенство b>a>c.


    public static void main(String[] args) {

        double a = 5.265;
        double b = 15.25;
        double c = 17.89;
        if (a < b && b < c)
        {
            System.out.println("1. Равенство выполняется");
        }
        else {
            System.out.println("1. Равенство НЕ выполняется");
        }
            if (b > a && a > c)
            {
                System.out.println("2.Равенство выполняется");
            }
            else
            {
                System.out.println("2. Равенство НЕ выполняется");
            }
        }


          }



