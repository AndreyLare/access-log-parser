import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();


        int resulta = number1 + number2;
        int resultb = number1 - number2;
        int resultс = number1 * number2;
        double resultd = (double) number1 /number2;


        System.out.println("Сумма = " + resulta);
        System.out.println("Разность = " + resultb);
        System.out.println("Произведение = " + resultс);
        System.out.println("Частное = " + resultd);


    }
}