import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        System.out.println("Введите операцию (+, -, *, /)");
        char operation = sc.next().charAt(0);

        if (operation == '+'){
            System.out.println("Результат вычисления : " + (number1+number2));
        } else if (operation == '-') {
            System.out.println("Результат вычисления : " + (number1-number2));
        }else if (operation == '*') {
            System.out.println("Результат вычисления : " + (number1*number2));
        } else if (operation == '/') {
            System.out.println("Результат вычисления : " + (number1/number2));
        }
    }
}
