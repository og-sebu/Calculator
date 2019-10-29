import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);

        double num1 = getNumberFromInput(scanInput, "Enter first number (or enter 'c' to skip)");

        double num2 = getNumberFromInput(scanInput, "Enter second number (or enter  'c' to skip)");

        char operator = getOperatorFromInput(scanInput, "Which operator (+ , - , / , *) ");
        double num3 = calculation(operator, num1, num2);

        System.out.println(num3);

    }

    public static double getNumberFromInput(Scanner scanInput, String request) {

        System.out.println(request);

        while (!scanInput.hasNextDouble()) {

            if (scanInput.hasNext("c")) {
                break;
            }

            System.out.println("Re-enter a (whole,decimal) number please");
            scanInput.next();

        }

        return scanInput.nextDouble();

    }

    public static double calculation(char operator, double num1, double num2) {

        double num3 = 0;

        switch (operator) {

            case '+':
                num3 = (num1 + num2);
                break;
            case '-':
                num3 = (num1 - num2);
                break;
            case '/':
                num3 = (num1 / num2);
                break;
            case '*':
                num3 = (num1 * num2);
                break;

        }

        return num3;

    }

    public static char getOperatorFromInput(Scanner scanInput, String request) {

        System.out.println(request);

        while (scanInput.hasNext()) {               //Führt Schleife ständig aus bis Signalwort eingegeben wird

            if (scanInput.hasNext("\\+" )) {                 //Break durch gegebenes Zeichen
                break;
            }

            if (scanInput.hasNext("-")) {                 //Break durch gegebenes Zeichen
                break;
            }

            if (scanInput.hasNext("/")) {                 //Break durch gegebenes Zeichen
                break;
            }

            if (scanInput.hasNext("\\*")) {                 //Break durch gegebenes Zeichen
                break;
            }

            System.out.println("Re-enter a operator (+ , - , / , *) ");
            scanInput.next();

        }

        return scanInput.next().charAt(0);

    }

}