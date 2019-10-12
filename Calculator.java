import java.util.Scanner;

public class Calculator {

    public static int getNumberFromInput(Scanner scanInput, String request) {

        System.out.println(request);

        while (!scanInput.hasNextDouble()) {             //Prüft ob Eingabe Int/Double entspricht, wiederholt Anfrage falls nicht

            if (scanInput.hasNext("c")) {
                break;
            }

            System.out.println("Re-enter a (whole,decimal) number please");
            scanInput.next();

        }

        return scanInput.nextInt();

    }

    public static double calculation(char operator, int num1, int num2) {

        double num3 = 0;

        switch (operator) {

            case '+':
                num3 = (num1 + num2);
                break;
            case '-':
                num3 = (num1 - num2);
                break;
            case '/':
                num3 = ((double) num1 / num2);
                break;
            case '*':
                num3 = (num1 * num2);
                break;

        }

        return num3;

    }

    public static char getOperatorFromInput(Scanner scanInput, String request) {

        System.out.println(request);

        return scanInput.next().charAt(0);

    }


    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);

        String request = "Enter first number (or enter 'c' to skip)";
        int num1 = getNumberFromInput(scanInput, request);

        request = "Enter second number (or enter  'c' to skip)";
        int num2 = getNumberFromInput(scanInput, request);

        char operator = getOperatorFromInput(scanInput, "Which operator (+ , - , / , *) ");
        double num3 = calculation(operator, num1, num2);

        System.out.println(num3);

    }

}
