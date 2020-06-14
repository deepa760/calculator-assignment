import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        float number1;
        float number2, result;
        System.out.println("Enter the two numbers ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextFloat();
        number2 = sc.nextFloat();
        //Operations.....
        System.out.println("1.Add\n 2.sub\n 3.Mul\n 4.Div\n \n Enter a choice ....");
        int choice;
        choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    result = add(number1, number2);
                    System.out.println("addition is" + result);
                    break;
                }
                case 2: {
                    result = sub(number1, number2);
                    System.out.println("subtraction is" + result);
                    break;
                }
                case 3: {
                    result = mul(number1, number2);
                    System.out.println("mul is" + result);
                    break;
                }
                case 4: {
                    result = div(number1, number2);
                    System.out.println("div is" + result);
                    break;
                }
            }

            public static float add(float a,float b){

                return a + b;
            }
            public static float sub(float a,float b )
            {

                return a - b;
            }
            public static float mul(float a,float b ){

                return a * b;
            }
            public static float div(float a,float b)
            {
                if (b == 0) {
                    System.out.println("Division cannot take place when number 2 is 0");
                    return 0;

                } else {
                    return a / b;
                }

            }
        }
