import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа, значения которых вы хотите поменять местами: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        System.out.println("Числа имели значение: " + number1 + " и " + number2);


        number1 -= number2;
        number2 -= -number1;
        number1 = number2 - number1;

        System.out.println("А теперь имеют значения как: " + number1 + " и " + number2);


    }
}