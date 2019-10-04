import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        boolean check1 , check2;
        double num1 = 0 , num2 = 0 , num3 = 0 ;
        char operator;

        Scanner scanInput = new Scanner (System.in);


        System.out.println("Enter first (whole,decimal) number");
        check1 = scanInput.hasNextDouble();
        if (check1) {
            num1 = scanInput.nextDouble();
        } else {
            System.out.println("Please enter a WHOLE or DECIMAL number");
        }


        System.out.println("Enter second (whole,decimal) number");
        check2 = scanInput.hasNextDouble();
        if (check2) {
            num2 = scanInput.nextDouble();
        } else {
            System.out.println("Please enter a WHOLE or DECIMAL number");
        }


        System.out.println("Which operator (+ , - , / , *) ");
        operator = scanInput.next().charAt(0);

        switch (operator) {

            case '+':  num3 =  (num1+num2);
                break;
            case '-':  num3 =  (num1-num2);
                break;
            case '/':  num3 =  (num1/num2);
                break;
            case '*':  num3 =  (num1*num2);
                break;

            }

        System.out.println(num3);

    }
}
