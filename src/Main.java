import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();


        int resulta = number+number2;
        int resultb = number-number2;
        int resultс = number*number2;
        double resultd = (double) number/number2;


        System.out.println("Сумма первого и второго числа = " + resulta);
        System.out.println("Разность первого и второго числа = " + resultb);
        System.out.println("Произведение первого и второго числа = " + resultс);
        System.out.println("Частное первого и второго числа = " + resultd);


    }
}