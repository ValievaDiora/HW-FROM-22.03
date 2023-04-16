import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1;
        int number2;
        boolean boolResult = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа для сложения:");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        boolResult = TrueOrFalse(number1, number2);

        System.out.println("Получившаяся сумма -> " + JustForToBeCLear(number1, number2)  + (boolResult ? ": Чётная" : ": Нечётная"));



    }
    public static boolean TrueOrFalse (int number1, int number2) {
       return  (number1 + number2) % 2 == 0;
    }
    public  static int JustForToBeCLear (int number1, int number2) {
        return (number1 + number2);
    }
}