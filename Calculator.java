import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        double num3 = 0 ;
        char operator;


        System.out.println("Enter (whole,decimal) number");         //Auffoderung zur <Eingabe>

        Scanner scanInput = new Scanner (System.in);                //Allererste <Eingabe> tätigen

        while(!scanInput.hasNextDouble()) {             //Prüft ob Eingabe Int/Double entspricht, wiederholt Anfrage falls nicht

        if (scanInput.hasNext("c")) {
            break; }

        System.out.println("Re-enter a (whole,decimal) number please");
        scanInput.next();

        }

        num1=scanInput.nextInt();                                    //Speichert <Eingabe> als num1

        System.out.println("Enter second (whole,decimal) number");        //Auffoderung zur zweiten <Eingabe>

        while(!scanInput.hasNextDouble()) {             //Prüft ob Eingabe Int/Double entspricht, wiederholt Anfrage falls nicht

            if (scanInput.hasNext("c")) {
                break; }

            System.out.println("Re-enter a (whole,decimal) number please");
            scanInput.next();

        }

        num2=scanInput.nextInt();                                         //Speichert zweite <Eingabe> als num2

        System.out.println("Which operator (+ , - , / , *) ");            //Auffoderung zur <Eingabe>
        operator = scanInput.next().charAt(0);                            //Speichert <Eingabe> als operator

        switch (operator) {

            case '+':  num3 =  (num1+num2);
                break;
            case '-':  num3 =  (num1-num2);
                break;
            case '/':  num3 =  ((double) num1/num2);
                break;
            case '*':  num3 =  (num1*num2);
                break;

            }

        System.out.println(num3);

    }
}
